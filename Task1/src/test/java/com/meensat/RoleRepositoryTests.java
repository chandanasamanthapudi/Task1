package com.meensat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.meensat.model.Role;
import com.meensat.repository.RoleRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace= Replace.NONE)
@Rollback(false)

public class RoleRepositoryTests {
	@Autowired RoleRepository rolerepo;
	
	@Test
	public void testCreateRoles() {
		Role vendor = new Role("Vendor");
	
		 rolerepo.save(vendor);
	}
}
