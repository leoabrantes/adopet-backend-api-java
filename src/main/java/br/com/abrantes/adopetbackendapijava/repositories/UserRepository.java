package br.com.abrantes.adopetbackendapijava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.abrantes.adopetbackendapijava.entities.User;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {

	User findByEmail(String email);
	
}
