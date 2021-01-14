package com.renato.movieflix.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.renato.movieflix.dto.MovieDTO;
import com.renato.movieflix.entities.Movie;
import com.renato.movieflix.entities.repositories.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository repository;
	
	public Page<MovieDTO> findAllMovies(PageRequest pageRequest) {
		Page<Movie> movies = repository.findAll(pageRequest);
		return movies.map(x -> new MovieDTO(x));
	}
}
