package br.com.abrantes.adopetbackendapijava.dto;

import java.io.Serializable;
import java.util.Objects;

import br.com.abrantes.adopetbackendapijava.entities.Pet;
import br.com.abrantes.adopetbackendapijava.entities.Shelter;
import br.com.abrantes.adopetbackendapijava.entities.enums.Size;
import br.com.abrantes.adopetbackendapijava.entities.enums.Species;
import br.com.abrantes.adopetbackendapijava.entities.enums.PetStatus;

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
	private Shelter shelter;
	
	public PetDTO() {
	}


	public PetDTO(Long id, String name, Double age, String personality, String picture_URL, Species species, Size size,
			PetStatus status, Shelter shelter) {
		super();
		this.id = id;
		this.name = name;
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
		name = entity.getName();
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


	public Shelter getShelter() {
		return shelter;
	}


	public void setShelter(Shelter shelter) {
		this.shelter = shelter;
	}


	@Override
	public int hashCode() {
		return Objects.hash(age, id, name, personality, picture_URL, shelter, size, species, status);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PetDTO other = (PetDTO) obj;
		return Objects.equals(age, other.age) && Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(personality, other.personality) && Objects.equals(picture_URL, other.picture_URL)
				&& Objects.equals(shelter, other.shelter) && size == other.size && species == other.species
				&& status == other.status;
	}


	


}
