package net.javaguides.springboot.springsecurity.web;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.javaguides.springboot.springsecurity.entity.Role;
import net.javaguides.springboot.springsecurity.entity.User;
import net.javaguides.springboot.springsecurity.repository.RoleRepository;
import net.javaguides.springboot.springsecurity.service.UserService;
import net.javaguides.springboot.springsecurity.web.dto.UserRegistrationDto;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private RoleRepository repoRole;

	@ModelAttribute("user")
	public UserRegistrationDto userRegistrationDto() {
		return new UserRegistrationDto();
	}

	@GetMapping("/signup")
	public String showRegistrationForm(Model model) {
		List<Role> roles = repoRole.findAll();
		model.addAttribute("roles", roles);
		return "registration";
	}
	
	@GetMapping()
	public String getAllUsers(Model model) {
		List<User> users = userService.findAll();
		model.addAttribute("users", users);
		List<Role> roles = repoRole.findAll();
		model.addAttribute("roles", roles);
		return "user";
	}
	
	
	@GetMapping("/{userId}/edit")
	public String editUser(@PathVariable(name ="userId") String id,Model model) { 
		System.out.println("userId: "+id);
		User obj = userService.findById(Long.parseLong(id)); 
		UserRegistrationDto userDto = new UserRegistrationDto();
		userDto.setFirstName(obj.getFirstName());
		userDto.setLastName(obj.getLastName());
		userDto.setEmail(obj.getEmail());
		userDto.setUsername(obj.getUsername());
		userDto.setPassword(obj.getPassword());
		userDto.setConfirmPassword(obj.getPassword());
		userDto.setRoles(obj.getRoles().stream().map(r -> r.getId()).collect(Collectors.toList()));
		model.addAttribute("user", userDto);
		List<Role> list = repoRole.findAll();
		model.addAttribute("roles", list); 
		return "user";
	}
	
	
	@GetMapping("/{userId}/delete")
	public String deleteUser(@PathVariable(name ="userId") String id) { 
		System.out.println("userId: "+id);
		User object = userService.findById(Long.parseLong(id)); 		
		userService.delete(object);
		return "redirect:/user?deleted";
	}

	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") @Valid UserRegistrationDto userDto,
			BindingResult result,Model model) { 
		
		User existing = userService.findByEmail(userDto.getEmail());
		if (existing != null) {
			result.rejectValue("email", null, "There is already an account registered with that email");
		}

		if (result.hasErrors()) {
			List<Role> roles = repoRole.findAll();
			model.addAttribute("roles", roles);
			return "user";
		}

		userService.save(userDto);
		return "redirect:/user?success";
	}

}
