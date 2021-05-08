package com.meensat;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGeneration {

	public static void main(String[] args) {
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String rawPassword = "chandu";
		String encodedPassword = encoder.encode(rawPassword);
		
		System.out.println(encodedPassword);
		

	}

}
