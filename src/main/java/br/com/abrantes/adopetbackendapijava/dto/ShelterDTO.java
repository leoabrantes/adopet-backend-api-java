package br.com.abrantes.adopetbackendapijava.dto;

import java.io.Serializable;

import br.com.abrantes.adopetbackendapijava.entities.Shelter;

public class ShelterDTO   implements Serializable{
	private static final long serialVersionUID = 1L;
		
	private Long id;
	private String name;
	private String city;
	private String state;
	private String email;
	private String telefone;
	
	public ShelterDTO() {
		
	}
	
	public ShelterDTO(Long id, String name, String city, String state, String email, String telefone) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.state = state;
		this.email = email;
		this.telefone = telefone;
	}


	public ShelterDTO(Shelter shelter) {
		id = shelter.getId();
		name = shelter.getName();
		city = shelter.getCity();
		state = shelter.getState();
		email = shelter.getEmail();
		telefone = shelter.getTelefone();
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

	
	
}
