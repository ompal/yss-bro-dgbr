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

import net.javaguides.springboot.springsecurity.entity.Department;
import net.javaguides.springboot.springsecurity.repository.DepartmentRepository;

@Controller
@RequestMapping("/department")
public class DepartmentController {
 
	@Autowired
	private DepartmentRepository repoDepartment;
 
	@ModelAttribute("department")
	public Department modalAttribuleDepartment() {
		return new Department();
	}
	
	@GetMapping()
	public String getAllDepartments(Model model) {
		List<Department> list = repoDepartment.findAll();
		model.addAttribute("departments", list); 
		return "department";
	}

	@PostMapping
	public String registerUserAccount(@ModelAttribute("department") @Valid Department department,
			BindingResult result,Model model) { 
		
		Department existing = repoDepartment.findByDeptName(department.getDeptName());
		if (existing != null) {
			result.rejectValue("deptName", null, "There is already added!!!");
		}

		if (result.hasErrors()) { 
			return "department";
		}

		repoDepartment.save(department);
		return "redirect:/department?success";
	}

}
