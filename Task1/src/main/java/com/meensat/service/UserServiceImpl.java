package com.meensat.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.meensat.dto.UserRegistrationDto;
import com.meensat.model.Role;
import com.meensat.model.User;
import com.meensat.repository.UserRepository;


@Service
public class UserServiceImpl implements  UserService{
	
	private UserRepository userRepository;
	

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	

	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	
	@Override
	public User save(UserRegistrationDto registrationDto) {
		User user = new User(registrationDto.getEmail(),
				registrationDto.getPhoneNumber(),
				registrationDto.getLocation(),
				registrationDto.getLogitude(),
				registrationDto.getLatitude(),
				 Arrays.asList(new Role("ROLE_USER")));	  
		return userRepository.save(user);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByEmail(username);
		if(user == null) {
			throw new UsernameNotFoundException("Invalid Email");
		}
		return new org.springframework.security.core.userdetails.User
				(user.getEmail(),username ,mapRolesToAuthorities(user.getRoles()));		
	}

	private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles) {
		
		return roles.stream().map(role -> 
		new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
	} 
}	