package com.devsuperior.adopetbackendapijava.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.adopetbackendapijava.dto.ShelterDTO;
import com.devsuperior.adopetbackendapijava.repositories.NotificationRepository;
import com.devsuperior.dslearnbds.entities.Notification;
import com.devsuperior.dslearnbds.entities.User;

@Service
public class NotificationService {

	@Autowired
	private NotificationRepository repository;
	
	
	@Autowired
	private AuthService authService;
	
	@Transactional(readOnly = true)
	public Page<ShelterDTO> notificationForCurrentUser(Pageable pageable) {
		User user = authService.authenticated();
		Page <Notification> page = repository.findByUser(user, pageable);
		return page.map(x -> new ShelterDTO(x));
		
		
	}
}
