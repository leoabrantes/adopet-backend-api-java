package br.com.abrantes.adopetbackendapijava.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.abrantes.adopetbackendapijava.dto.PetDTO;
import br.com.abrantes.adopetbackendapijava.entities.Pet;
import br.com.abrantes.adopetbackendapijava.repositories.PetRepository;

@Service
public class PetService {

	@Autowired
	private PetRepository repository;
	
	@Transactional
	public void saveRevision(Long id, PetDTO dto) {
		Pet deliver = repository.getOne(id);
		deliver.setStatus(dto.getStatus());
		deliver.setFeedback(dto.getFeedback());
		deliver.setCorrectCount(dto.getCorrectCount());
		repository.save(deliver);
		
	} 
}
