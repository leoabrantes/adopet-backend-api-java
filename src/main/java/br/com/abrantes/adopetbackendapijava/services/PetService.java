package br.com.abrantes.adopetbackendapijava.services;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.leoabrantes.dsclient.dto.PetDTO;

import br.com.abrantes.adopetbackendapijava.dto.PetDTO;
import br.com.abrantes.adopetbackendapijava.entities.Pet;
import br.com.abrantes.adopetbackendapijava.repositories.PetRepository;
import br.com.abrantes.adopetbackendapijava.services.exceptions.DatabaseException;
import br.com.abrantes.adopetbackendapijava.services.exceptions.ResourceNotFoundException;

@Service
public class PetService {

	@Autowired
	private PetRepository repository;
	
	
	@Transactional(readOnly = true)
	public Page<PetDTO> findAllPet(PageRequest pageRequest){
		Page<Pet> list = repository.findAll(pageRequest);
		
		return list.map(x -> new PetDTO(x));
	}

	
	@Transactional(readOnly = true)
	public PetDTO findById(Long id) {
		Optional<Pet> obj = repository.findById(id);
		Pet entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new PetDTO(entity);
	}

	@Transactional
	public PetDTO insert(PetDTO dto) {
		Pet entity = new Pet();
		entity.setName(dto.get);
		entity.setCpf(dto.getCpf());
		entity.setIncome(dto.getIncome());
		entity.setBirthDate(dto.getBirthDate());
		entity.setChildren(dto.getChildren());
		entity = repository.save(entity);
		return new PetDTO(entity);

	}

	@Transactional
	public PetDTO update(Long id, PetDTO dto) {
		try {
			Pet entity = repository.getOne(id);
			entity.setName(dto.getName());
			entity.setCpf(dto.getCpf());
			entity.setIncome(dto.getIncome());
			entity.setBirthDate(dto.getBirthDate());
			entity.setChildren(dto.getChildren());
			entity = repository.save(entity);
			return new PetDTO(entity);
		}
		catch(EntityNotFoundException e){
			throw new ResourceNotFoundException("Id not found" + id);
		}
	}

	public void delete(Long id) {
		try {
		repository.deleteById(id);
		}
		catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException("Id not found" + id);
		}
		catch(DataIntegrityViolationException e) {
			throw new DatabaseException("Integrity violation");
		}
	}
	
	
}
