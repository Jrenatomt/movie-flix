package com.renato.movieflix.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renato.movieflix.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);
}
