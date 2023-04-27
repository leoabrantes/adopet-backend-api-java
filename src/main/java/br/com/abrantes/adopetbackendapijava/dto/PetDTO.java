package br.com.abrantes.adopetbackendapijava.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import br.com.abrantes.adopetbackendapijava.entities.Pet;
import br.com.abrantes.adopetbackendapijava.entities.Shelter;
import br.com.abrantes.adopetbackendapijava.entities.enums.PetStatus;
import br.com.abrantes.adopetbackendapijava.entities.enums.Size;
import br.com.abrantes.adopetbackendapijava.entities.enums.Species;

public class PetDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private Double age;
	private String personality;
	private String picture_URL;
	private Species species;
	private Size size;
	private PetStatus status;
	
	private Set<ShelterDTO> shelteries = new HashSet<>();

	
	public PetDTO() {
	}


	public PetDTO(Long id, String name, Double age, String personality, String picture_URL, Species species, Size size,
			PetStatus status) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.personality = personality;
		this.picture_URL = picture_URL;
		this.species = species;
		this.size = size;
		this.status = status;
	}
	
	public PetDTO(Pet entity) {
		id = entity.getId();
		name = entity.getName();
		age = entity.getAge();
		personality = entity.getPersonality();
		picture_URL = entity.getPicture_URL();
		species = entity.getSpecies();
		size = entity.getSize();
		status = entity.getStatus();
		
	}
	
	public PetDTO(Pet entity, Set<Shelter> shelteries) {
		this(entity);
		shelteries.forEach(cat -> this.shelteries.add(new ShelterDTO(cat)));
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getAge() {
		return age;
	}


	public void setAge(Double age) {
		this.age = age;
	}


	public String getPersonality() {
		return personality;
	}


	public void setPersonality(String personality) {
		this.personality = personality;
	}


	public String getPicture_URL() {
		return picture_URL;
	}


	public void setPicture_URL(String picture_URL) {
		this.picture_URL = picture_URL;
	}


	public Species getSpecies() {
		return species;
	}


	public void setSpecies(Species species) {
		this.species = species;
	}


	public Size getSize() {
		return size;
	}


	public void setSize(Size size) {
		this.size = size;
	}


	public PetStatus getStatus() {
		return status;
	}


	public void setStatus(PetStatus status) {
		this.status = status;
	}


	public Set<ShelterDTO> getShelter() {
		return shelteries;
	}







	


}
