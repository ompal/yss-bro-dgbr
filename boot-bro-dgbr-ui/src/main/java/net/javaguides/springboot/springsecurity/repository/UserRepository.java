package net.javaguides.springboot.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.springsecurity.entity.User; 

@Repository
public interface UserRepository extends JpaRepository<User, Long> { 
	
	User findByUsername(String username);
	
	User findByEmail(String email);
}
