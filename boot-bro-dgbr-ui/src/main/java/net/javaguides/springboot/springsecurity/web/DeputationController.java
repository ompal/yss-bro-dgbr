package net.javaguides.springboot.springsecurity.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.javaguides.springboot.springsecurity.service.DeputationService;

@Controller
@RequestMapping("/deputation")
public class DeputationController {
 
	@Autowired
	private DeputationService dpService;
  
	@GetMapping()
	public String getAllPosting(Model model) { 
		model.addAttribute("deputations", dpService.findAll()); 
		model.addAttribute("totalDeputation",dpService.findTodal().get(0).getNosOfPersOnDeputation()); 
		return "deputation";
	}
	 
}
