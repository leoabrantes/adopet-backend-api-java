package br.com.abrantes.adopetbackendapijava.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.abrantes.adopetbackendapijava.entities.User;
import br.com.abrantes.adopetbackendapijava.repositories.UserRepository;
import br.com.abrantes.adopetbackendapijava.services.exceptions.ForbiddenException;
import br.com.abrantes.adopetbackendapijava.services.exceptions.UnauthorizedException;

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

	public void validateAdmin() {
		User user = authenticated();
		if(!user.hasHole("ROLE_ADMIN")) {
			throw new ForbiddenException ("Access denied");
		}
		
	}

}
