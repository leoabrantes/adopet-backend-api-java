package br.com.abrantes.adopetbackendapijava.services;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.abrantes.adopetbackendapijava.dto.ShelterDTO;
import br.com.abrantes.adopetbackendapijava.dto.ShelterDTO;
import br.com.abrantes.adopetbackendapijava.entities.Shelter;
import br.com.abrantes.adopetbackendapijava.entities.Shelter;
import br.com.abrantes.adopetbackendapijava.entities.User;
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
		Page<Shelter> list = repository.findAll(pageRequest);
		
		return list.map(x -> new ShelterDTO(x));
	}

	
	@Transactional(readOnly = true)
	public ShelterDTO findByName(String name) {
		Shelter obj = repository.findByName(name);
		return new ShelterDTO(entity);
	}

	@Transactional
	public ShelterDTO insert(ShelterDTO dto) {
		Shelter entity = new Shelter();
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setPersonality(dto.getPersonality());
		entity.setPicture_URL(dto.getPicture_URL());
		entity.setSpecies(dto.getSpecies());
		entity.setShelter(dto.getShelter());
		entity.setSize(dto.getSize());
		entity.setStatus(dto.getStatus());
		entity.setShelter(dto.getShelter());
		entity = repository.save(entity);
		return new ShelterDTO(entity);

	}

	@Transactional
	public ShelterDTO update(Long id, ShelterDTO dto) {
		try {
			Shelter entity = repository.getOne(id);
			entity.setName(dto.getName());
			entity.setAge(dto.getAge());
			entity.setPersonality(dto.getPersonality());
			entity.setPicture_URL(dto.getPicture_URL());
			entity.setSpecies(dto.getSpecies());
			entity.setShelter(dto.getShelter());
			entity.setSize(dto.getSize());
			entity.setStatus(dto.getStatus());
			entity.setShelter(dto.getShelter());
			return new ShelterDTO(entity);
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
