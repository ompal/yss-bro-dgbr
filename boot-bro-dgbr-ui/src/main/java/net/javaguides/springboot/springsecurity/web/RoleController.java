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
import org.springframework.web.bind.annotation.RequestParam;

import net.javaguides.springboot.springsecurity.entity.Permission;
import net.javaguides.springboot.springsecurity.entity.Role;
import net.javaguides.springboot.springsecurity.repository.PermissionRepository;
import net.javaguides.springboot.springsecurity.repository.RoleRepository;

@Controller
@RequestMapping("/role")
public class RoleController {

	@Autowired
	private RoleRepository repoRole;

	@Autowired
	private PermissionRepository repoPermission;

	@ModelAttribute("role")
	public Role perModalAttribule(Model model) { 
		return new Role();
	}

	@GetMapping()
	public String getAllRoles(@RequestParam(name = "id", required = false) String id,
			@RequestParam(name = "action", required = false) String action, Model model) {
		
		if (action != null && !action.isEmpty() && action.equalsIgnoreCase("edit")) {
			model.addAttribute("role", repoRole.findById(Long.parseLong(id)));
			model.addAttribute("action", "put");
		} else {
			if (action != null && !action.isEmpty() && action.equalsIgnoreCase("delete")) { 
				repoRole.delete(repoRole.findById(Long.parseLong(id)).get());
			}
		}
		List<Role> list = repoRole.findAll();
		model.addAttribute("roles", list);
		List<Permission> perLIst = repoPermission.findAll();
		model.addAttribute("permissionsList", perLIst);
		return "role";
	}
 

	@PostMapping
	public String saveRole(@ModelAttribute("role") @Valid Role role, BindingResult result, Model model) {		 
		repoRole.save(role);
		return "redirect:/role?success";
	}

}
