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

import net.javaguides.springboot.springsecurity.entity.Project;
import net.javaguides.springboot.springsecurity.repository.ProjectRepository;

@Controller
@RequestMapping("/project")
public class ProjectController {
 
	@Autowired
	private ProjectRepository repoProject;
 
	@ModelAttribute("project")
	public Project modalAttribuleProject() {
		return new Project();
	}
	
	@GetMapping()
	public String getAllProjects(
			@RequestParam(name = "adg",required = false) String adg,
			@RequestParam(name = "projectType",required = false) String projectType,
			Model model) {
		List<Project> list = null;
		if(adg != null && !adg.isEmpty()) {
			list = repoProject.findAllByAGD(adg);
		} else if(projectType != null && !projectType.isEmpty()) {
			list = repoProject.findAllByProjectType(projectType);
		} else {
			list = repoProject.findAll();
		} 
		model.addAttribute("projects", list); 
		return "project";
	} 
	
	
	@PostMapping
	public String registerUserAccount(@ModelAttribute("project") @Valid Project project,
			BindingResult result,Model model) { 
		
		Project existing = repoProject.findByProjName(project.getProjName());
		if (existing != null) {
			result.rejectValue("projName", null, "There is already added!!!");
		}

		if (result.hasErrors()) { 
			return "project";
		}

		repoProject.save(project);
		return "redirect:/project?success";
	}

}
