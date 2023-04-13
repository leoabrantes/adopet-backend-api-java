package br.com.abrantes.adopetbackendapijava.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.abrantes.adopetbackendapijava.entities.Pet;

public interface PetRepository extends JpaRepository <Pet, Long> {
		
	Optional<Pet> findById(Long id);
	
}
