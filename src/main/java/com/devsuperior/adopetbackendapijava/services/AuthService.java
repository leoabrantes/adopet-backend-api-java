package com.devsuperior.adopetbackendapijava.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.adopetbackendapijava.repositories.UserRepository;
import com.devsuperior.adopetbackendapijava.services.exceptions.ForbiddenException;
import com.devsuperior.adopetbackendapijava.services.exceptions.UnauthorizedException;
import com.devsuperior.dslearnbds.entities.User;

@Service
public class AuthService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Transactional(readOnly = true)
	public User authenticated() {
		try {
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		return userRepository.findByEmail(username);
		}
		catch(Exception e) {
			throw new UnauthorizedException("Invalid user");
		}
	}
	
	public void validateSelfOrAdmin (Long userId) {
		User user = authenticated();
		if(!user.getId().equals(userId) && !user.hasHole("ROLE_ADMIN")) {
			throw new ForbiddenException ("Access denied");
		}
			
	}

}
