package br.com.abrantes.adopetbackendapijava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.abrantes.adopetbackendapijava.entities.Shelter;

public interface ShelterRepository extends JpaRepository <Shelter, Long> {
			
	Shelter findByName(String name);
	
}
