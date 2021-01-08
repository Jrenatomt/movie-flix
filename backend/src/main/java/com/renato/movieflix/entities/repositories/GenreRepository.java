package com.renato.movieflix.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renato.movieflix.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}
