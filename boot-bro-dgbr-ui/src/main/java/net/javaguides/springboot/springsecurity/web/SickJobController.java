package net.javaguides.springboot.springsecurity.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.javaguides.springboot.springsecurity.service.SickJobService;

@Controller
@RequestMapping("/sick-jobs")
public class SickJobController {
 
	@Autowired
	private SickJobService sjService;
  
	@GetMapping()
	public String getAllSickJob(Model model) { 
		model.addAttribute("sickjobs", sjService.findAll());  
		model.addAttribute("sickjobsProjectWise", sjService.findAllProjectWise());  
		return "sickjobs";
	}
	 
}
