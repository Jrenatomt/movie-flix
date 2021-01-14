package com.renato.movieflix.dto;

import java.io.Serializable;

import com.renato.movieflix.entities.Genre;

public class GenreDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	
	public GenreDTO() {
	}

	public GenreDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public GenreDTO(Genre entity) {
		id = entity.getId();
		name = entity.getName();
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
}
