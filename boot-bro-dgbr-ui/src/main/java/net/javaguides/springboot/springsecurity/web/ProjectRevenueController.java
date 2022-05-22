package net.javaguides.springboot.springsecurity.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.javaguides.springboot.springsecurity.service.ProjectRevenueCapitalService;
import net.javaguides.springboot.springsecurity.web.dto.ProjectRevenueCapitalDto;

@Controller
@RequestMapping("/project-revenue-capital")
public class ProjectRevenueController {
 
	@Autowired
	private ProjectRevenueCapitalService prcService;
  
	@GetMapping()
	public String getAllRevenueCapital(Model model) {
		List<ProjectRevenueCapitalDto> list = prcService.findAll();
		model.addAttribute("projectRevenues", list); 
		List<ProjectRevenueCapitalDto> totalList = prcService.findTotal();
		model.addAttribute("totalRevenues", totalList); 
		return "revenue";
	}
	
	
	@GetMapping("/total")
	public String getTotalRevenueCapital(Model model) {
		List<ProjectRevenueCapitalDto> list = prcService.findTotal();
		model.addAttribute("totalRevenues", list); 
		return "revenue";
	}
 
}
