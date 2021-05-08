package com.meensat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meensat.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {


	public void saveAll();
	

	

}
