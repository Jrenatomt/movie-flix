package com.renato.movieflix.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.renato.movieflix.dto.MovieDTO;
import com.renato.movieflix.entities.Genre;
import com.renato.movieflix.entities.Movie;
import com.renato.movieflix.entities.repositories.GenreRepository;
import com.renato.movieflix.entities.repositories.MovieRepository;
import com.renato.movieflix.services.exception.ResourceNotFoundException;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository repository;
	
	@Autowired
	private GenreRepository genreRepository;
	
	@Transactional(readOnly = true)
	public MovieDTO findMovie(Long id) {
		Optional<Movie> movie = repository.findById(id);
		Movie entity = movie.orElseThrow(() -> new ResourceNotFoundException("Filme não encontrado"));
		return new MovieDTO(entity, entity.getReviews());
	}
	
	@Transactional(readOnly = true)
	public Page<MovieDTO> findAllMovies(Long genreId, PageRequest pageRequest) {
		Genre genre = (genreId == 0) ? null : genreRepository.getOne(genreId);
		Page<Movie> movies = repository.findAllMovies(genre, pageRequest);
		return movies.map(x -> new MovieDTO(x));
	}
}
