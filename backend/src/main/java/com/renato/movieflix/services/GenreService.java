package com.renato.movieflix.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renato.movieflix.dto.GenreDTO;
import com.renato.movieflix.entities.Genre;
import com.renato.movieflix.entities.repositories.GenreRepository;

@Service
public class GenreService {
	
	@Autowired
	private GenreRepository repository;

	public List<GenreDTO> findAll() {
		List<Genre> genres = repository.findAll();
		return genres.stream().map(x -> new GenreDTO(x)).collect(Collectors.toList());
	}
}
