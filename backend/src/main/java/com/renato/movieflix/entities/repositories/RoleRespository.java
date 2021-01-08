package com.renato.movieflix.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renato.movieflix.entities.Role;

public interface RoleRespository extends JpaRepository<Role, Long> {

}
