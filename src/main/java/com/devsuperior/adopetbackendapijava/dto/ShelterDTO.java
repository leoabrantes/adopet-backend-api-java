package com.devsuperior.adopetbackendapijava.dto;

import java.io.Serializable;

import br.com.abrantes.adopetbackendapijava.entities.Shelter;

public class ShelterDTO   implements Serializable{
	private static final long serialVersionUID = 1L;
		
	private Long id;
	private String name;
	private String city;
	private String state;
	
	public ShelterDTO() {
		
	}
	
	public ShelterDTO(Long id, String name, String city, String state) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.state = state;
	}


	public ShelterDTO(Shelter shelter) {
		id = shelter.getId();
		name = shelter.getName();
		city = shelter.getCity();
		state = shelter.getState();
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

	
	
}
