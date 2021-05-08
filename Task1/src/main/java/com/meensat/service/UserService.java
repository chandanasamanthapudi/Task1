package com.meensat.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.meensat.dto.UserRegistrationDto;
import com.meensat.model.User;

public interface UserService extends UserDetailsService {
	
	User save(UserRegistrationDto registrationDto);
	

}
