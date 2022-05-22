package net.javaguides.springboot.springsecurity.advice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import net.javaguides.springboot.springsecurity.entity.User;
import net.javaguides.springboot.springsecurity.repository.UserRepository;

@ControllerAdvice
public class CurrentUserControllerAdvice {
	
	@Autowired
	UserRepository repoUser;
	
    @ModelAttribute("currentUser")
    public String getCurrentUser(Authentication authentication) {
    	if(authentication != null) {
    		UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        	User user = repoUser.findByEmail(userDetails.getUsername());
        	return user.getFirstName()+" "+user.getLastName();
    	}
    	return "";
    	
    }
}
