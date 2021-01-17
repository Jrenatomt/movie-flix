package com.renato.movieflix.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.renato.movieflix.entities.User;
import com.renato.movieflix.entities.repositories.UserRepository;
import com.renato.movieflix.services.exception.ForbiddenException;
import com.renato.movieflix.services.exception.UnAuthorizedException;

@Service
public class AuthService {

	@Autowired
	private UserRepository userRepository;
	
	@Transactional(readOnly = true)
	public User authenticated() {		
		try {
			String username = SecurityContextHolder.getContext().getAuthentication().getName();
			return userRepository.findByEmail(username);
		}catch (Exception e) {
			throw new UnAuthorizedException("Usuario Inválido");
		}
	}
	
	public void validateSelfOrAdmin(Long userId) {
		
		User user = authenticated();
		if(!user.hasHole("ROLE_MEMBER")) {
			throw new ForbiddenException("Acesso Negado");
		}
	}
}
