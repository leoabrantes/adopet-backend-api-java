package br.com.abrantes.adopetbackendapijava.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.abrantes.adopetbackendapijava.dto.PetDTO;
import br.com.abrantes.adopetbackendapijava.services.DeliverService;

@RestController
@RequestMapping(value = "/shelteries")
public class ShelterResource {

	@Autowired
	private ShelterService service;
	
	@PreAuthorize("hasAnyRole('ADMIN', 'TUTOR')")
	@PutMapping(value = "/{id}")
	public ResponseEntity<Void> saveRevision(@PathVariable Long id, @RequestBody ShelterDTO dto) {
		service.saveRevision(id, dto);
		return ResponseEntity.noContent().build();
	}
}
