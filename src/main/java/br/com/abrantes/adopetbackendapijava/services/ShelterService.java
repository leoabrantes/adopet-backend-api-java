package br.com.abrantes.adopetbackendapijava.services;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.abrantes.adopetbackendapijava.dto.ShelterDTO;
import br.com.abrantes.adopetbackendapijava.entities.Shelter;
import br.com.abrantes.adopetbackendapijava.repositories.ShelterRepository;
import br.com.abrantes.adopetbackendapijava.services.exceptions.DatabaseException;
import br.com.abrantes.adopetbackendapijava.services.exceptions.ResourceNotFoundException;

@Service
public class ShelterService {

	@Autowired
	private ShelterRepository repository;
	
	
	@Autowired
	private AuthService authService;
	
	@Transactional(readOnly = true)
	public Page<ShelterDTO> findAllPaged(PageRequest pageRequest){
		
		authService.validateAdmin();
		
		Page<Shelter> list = repository.findAll(pageRequest);
		
		return list.map(x -> new ShelterDTO(x));
	}

	
	@Transactional(readOnly = true)
	public ShelterDTO findByName(String name) {
		Shelter obj = repository.findByName(name);
		return new ShelterDTO(obj);
	}

	@Transactional
	public ShelterDTO insert(ShelterDTO dto) {
		authService.validateAdmin();
		Shelter entity = new Shelter();
		entity.setName(dto.getName());
		entity.setCity(dto.getCity());
		entity.setState(dto.getState());
		entity = repository.save(entity);
		return new ShelterDTO(entity);
	}

	@Transactional
	public ShelterDTO update(String name, ShelterDTO dto) {
			authService.validateAdmin();
		try {
			Shelter entity = repository.getOne(name);
			entity.setName(dto.getName());
			entity.setCity(dto.getCity());
			entity.setState(dto.getState());
			return new ShelterDTO(entity);
		}
		catch(EntityNotFoundException e){
			throw new ResourceNotFoundException("Name not found" + name);
		}
	}

	public void delete(String name) {
		authService.validateAdmin();
		try {
		repository.deleteById(name);
		}
		catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException("Id not found" + name);
		}
		catch(DataIntegrityViolationException e) {
			throw new DatabaseException("Integrity violation");
		}
	}
	
	
}
