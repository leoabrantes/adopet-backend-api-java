package br.com.abrantes.adopetbackendapijava.dto;

import java.io.Serializable;

import br.com.abrantes.adopetbackendapijava.entities.Pet;
import br.com.abrantes.adopetbackendapijava.entities.Shelter;
import br.com.abrantes.adopetbackendapijava.entities.enums.Size;
import br.com.abrantes.adopetbackendapijava.entities.enums.Species;
import br.com.abrantes.adopetbackendapijava.entities.enums.Status;

public class PetDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Double age;
	private String personality;
	private String picture_URL;
	private Species species;
	private Size size;
	private Status status;
	private Shelter shelter;
	
	public PetDTO() {
	}


	public PetDTO(Long id, Double age, String personality, String picture_URL, Species species, Size size,
			Status status, Shelter shelter) {
		super();
		this.id = id;
		this.age = age;
		this.personality = personality;
		this.picture_URL = picture_URL;
		this.species = species;
		this.size = size;
		this.status = status;
		this.shelter = shelter;
	}
	
	public PetDTO(Pet entity) {
		id = entity.getId();
		age = entity.getAge();
		personality = entity.getPersonality();
		picture_URL = entity.getPicture_URL();
		species = entity.getSpecies();
		size = entity.getSize();
		status = entity.getStatus();
		shelter = entity.getShelter();
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
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


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}


	public Shelter getShelter() {
		return shelter;
	}


	public void setShelter(Shelter shelter) {
		this.shelter = shelter;
	}


}
