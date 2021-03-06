package com.renato.movieflix.resouces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.renato.movieflix.dto.MovieDTO;
import com.renato.movieflix.services.MovieService;

@RestController
@RequestMapping(value = "/movies")
public class MovieResources {
	
	@Autowired
	private MovieService service;
	
	@GetMapping
	public ResponseEntity<Page<MovieDTO>> findAll(
			@RequestParam(value = "genreId", defaultValue = "0") Long genreId,
			@RequestParam(value = "page", defaultValue = "0") Integer page,
			@RequestParam(value = "linesPerPage", defaultValue = "12") Integer linesPerPage,
			@RequestParam(value = "direction", defaultValue = "ASC") String direction,
			@RequestParam(value = "orderBy", defaultValue = "title") String orderBy ){
		
		PageRequest pegaRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		Page<MovieDTO> movies = service.findAllMovies(genreId, pegaRequest);
		return ResponseEntity.ok().body(movies);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<MovieDTO> findById(@PathVariable Long id) {
		MovieDTO dto = service.findMovie(id);
		return ResponseEntity.ok().body(dto);
	}


}
