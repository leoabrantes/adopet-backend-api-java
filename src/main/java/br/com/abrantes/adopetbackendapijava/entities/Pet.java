package br.com.abrantes.adopetbackendapijava.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.abrantes.adopetbackendapijava.entities.enums.PetStatus;
import br.com.abrantes.adopetbackendapijava.entities.enums.Size;
import br.com.abrantes.adopetbackendapijava.entities.enums.Species;

@Entity
@Table(name="tb_pet")
public class Pet implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Double age;
	private String personality;
	private String picture_URL;
	private Species species;
	private Size size;
	private PetStatus status;
	
	
	@ManyToOne
	@JoinTable(name = "tb_pet_shelter",
			joinColumns = @JoinColumn(name = "pet_id"),
			inverseJoinColumns = @JoinColumn(name = "shelter_id"))
	private Shelter shelter;
	
	public Pet() {
	}
	

	public Pet(Long id, String name, Double age, String personality, String picture_URL, Species species, Size size, 
			PetStatus status, Shelter shelter) {
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
		Pet other = (Pet) obj;
		return Objects.equals(age, other.age) && Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(personality, other.personality) && Objects.equals(picture_URL, other.picture_URL)
				&& Objects.equals(shelter, other.shelter) && size == other.size && species == other.species
				&& status == other.status;
	}


}
