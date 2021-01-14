package com.renato.movieflix.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renato.movieflix.entities.Review;

public interface ReviewRepository extends JpaRepository<Review, Long>{

}
