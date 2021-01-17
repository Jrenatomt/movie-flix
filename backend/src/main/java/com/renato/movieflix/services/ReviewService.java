package com.renato.movieflix.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.renato.movieflix.dto.ReviewDTO;
import com.renato.movieflix.entities.Movie;
import com.renato.movieflix.entities.Review;
import com.renato.movieflix.entities.User;
import com.renato.movieflix.entities.repositories.MovieRepository;
import com.renato.movieflix.entities.repositories.ReviewRepository;

@Service
public class ReviewService {

	@Autowired
	private ReviewRepository repository;
	
	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private AuthService authService;

	@Transactional
	public ReviewDTO insert(ReviewDTO dto) {
		Movie movie = movieRepository.getOne(dto.getMovieId());
		User user = authService.authenticated();
		
		authService.validateSelfOrAdmin(user.getId());
		
		Review entity = new Review();		
		entity.setText(dto.getText());
		entity.setMovie(movie);
		entity.setUser(user);
		entity = repository.save(entity);
		return new ReviewDTO(entity);
	}	
}


