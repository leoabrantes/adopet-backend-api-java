package br.com.abrantes.adopetbackendapijava.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.abrantes.adopetbackendapijava.dto.ShelterDTO;
import br.com.abrantes.adopetbackendapijava.services.PetService;

@RestController
@RequestMapping(value = "/pet")
public class PetResource {
	
	@Autowired
	private PetService service;
	
	@GetMapping
	public ResponseEntity<Page<PetDTO>> notificationsForCurrentUser(Pageable pageable){
		Page<ShelterDTO> page = service.notificationForCurrentUser(pageable);
		return ResponseEntity.ok().body(page);
		
	}

}
