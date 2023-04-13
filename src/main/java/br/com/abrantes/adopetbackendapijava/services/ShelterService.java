package br.com.abrantes.adopetbackendapijava.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.abrantes.adopetbackendapijava.dto.ShelterDTO;
import br.com.abrantes.adopetbackendapijava.entities.Shelter;
import br.com.abrantes.adopetbackendapijava.entities.User;
import br.com.abrantes.adopetbackendapijava.repositories.ShelterRepository;

@Service
public class ShelterService {

	@Autowired
	private ShelterRepository repository;
	
	
	@Autowired
	private AuthService authService;
	
	@Transactional(readOnly = true)
	public Page<ShelterDTO> notificationForCurrentUser(Pageable pageable) {
		User user = authService.authenticated();
		Page <Shelter> page = repository.findByName(user, pageable);
		return page.map(x -> new ShelterDTO(x));
		
		
	}
}
