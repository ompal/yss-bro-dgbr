package net.javaguides.springboot.springsecurity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.springsecurity.entity.Role;
import net.javaguides.springboot.springsecurity.entity.User;
import net.javaguides.springboot.springsecurity.repository.RoleRepository;
import net.javaguides.springboot.springsecurity.repository.UserRepository;
import net.javaguides.springboot.springsecurity.web.dto.UserRegistrationDto;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private RoleRepository repoRole;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public User findByEmail(String email){
    	
        return userRepository.findByEmail(email);
    }

    public User save(UserRegistrationDto registration){
    	 
    	List<Role> roles = repoRole.findRoleByIds(registration.getRoles());
    	
        User user = new User();
        user.setFirstName(registration.getFirstName());
        user.setLastName(registration.getLastName());
        user.setEmail(registration.getEmail());
        user.setUsername(registration.getUsername());
        user.setPassword(passwordEncoder.encode(registration.getPassword())); 
        user.setRoles(roles);
        user.setEnabled(true);
        return userRepository.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null){
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        return new org.springframework.security.core.userdetails.User(user.getEmail(),
                user.getPassword(),
                user.getAuthorities());
    }

	@Override
	public List<User> findAll() { 
		return userRepository.findAll();
	}

	@Override
	public User findById(Long id) { 
		return userRepository.findById(id).get();
	}

	@Override
	public void delete(User user) {
		userRepository.delete(user);
		
	}
 
}
