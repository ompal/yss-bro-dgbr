package net.javaguides.springboot.springsecurity.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import net.javaguides.springboot.springsecurity.entity.User;
import net.javaguides.springboot.springsecurity.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    User findByEmail(String email); 

    User save(UserRegistrationDto registration);
    
    User findById(Long id);
    
    void delete(User user);
    
    List<User> findAll();
}
