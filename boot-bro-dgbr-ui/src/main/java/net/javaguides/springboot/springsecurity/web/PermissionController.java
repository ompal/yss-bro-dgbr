package net.javaguides.springboot.springsecurity.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.javaguides.springboot.springsecurity.entity.Permission;
import net.javaguides.springboot.springsecurity.repository.PermissionRepository;

@Controller
@RequestMapping("/permission")
public class PermissionController {
 
	@Autowired
	private PermissionRepository repoPermission;
 
	@ModelAttribute("permission")
	public Permission perModalAttribule() {
		return new Permission();
	}
	
	@GetMapping()
	public String getAllPermissions(Model model) {
		List<Permission> list = repoPermission.findAll();
		model.addAttribute("permissions", list); 
		return "permission";
	}

	@PostMapping
	public String registerUserAccount(@ModelAttribute("permission") @Valid Permission permission,
			BindingResult result,Model model) { 
		
		Permission existing = repoPermission.findByName(permission.getName());
		if (existing != null) {
			result.rejectValue("name", null, "There is already added!!!");
		}

		if (result.hasErrors()) { 
			return "permission";
		}

		repoPermission.save(permission);
		return "redirect:/permission?success";
	}

}
