package com.meensat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meensat.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}

