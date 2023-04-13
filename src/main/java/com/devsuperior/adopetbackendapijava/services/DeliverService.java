package com.devsuperior.adopetbackendapijava.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.adopetbackendapijava.dto.PetDTO;
import com.devsuperior.adopetbackendapijava.repositories.DeliverRepository;
import com.devsuperior.dslearnbds.entities.Deliver;

@Service
public class DeliverService {

	@Autowired
	private DeliverRepository repository;
	
	@Transactional
	public void saveRevision(Long id, PetDTO dto) {
		Deliver deliver = repository.getOne(id);
		deliver.setStatus(dto.getStatus());
		deliver.setFeedback(dto.getFeedback());
		deliver.setCorrectCount(dto.getCorrectCount());
		repository.save(deliver);
		
	} 
}
