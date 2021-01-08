package com.renato.movieflix.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renato.movieflix.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
