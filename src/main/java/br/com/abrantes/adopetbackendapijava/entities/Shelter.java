package br.com.abrantes.adopetbackendapijava.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_shelter")
public class Shelter implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String city;
	private String state;
	private String email;
	private String telefone;
	
	@OneToMany(mappedBy = "shelter")
	private List<Pet> pets = new ArrayList<>();
	
		
	public Shelter() {
	}
	

	public Shelter(Long id, String name, String city, String state, String email, String telefone) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.state = state;
		this.email = email;
		this.telefone = telefone;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public List<Pet> getPet() {
		return pets;
	}


	@Override
	public int hashCode() {
		return Objects.hash(city, email, id, name, pets, state, telefone);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shelter other = (Shelter) obj;
		return Objects.equals(city, other.city) && Objects.equals(email, other.email) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(pets, other.pets)
				&& Objects.equals(state, other.state) && Objects.equals(telefone, other.telefone);
	}

	
	
	

}
