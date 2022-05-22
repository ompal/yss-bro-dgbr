package net.javaguides.springboot.springsecurity.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.javaguides.springboot.springsecurity.service.MinisteryWiseSummaryService;
import net.javaguides.springboot.springsecurity.web.dto.MinistryWiseSummaryDto;

@Controller
@RequestMapping("/ministry-wise-summary")
public class MinistryWiseSummaryController {
 
	@Autowired
	private MinisteryWiseSummaryService mwsService;
  
	@GetMapping()
	public String getAllMinisteryWiseSummary(@RequestParam(name="totalBy",required = false) String by,Model model) {
		List<MinistryWiseSummaryDto> list;
		if(by != null && !by.isEmpty() && by.equalsIgnoreCase("project")) {
			list = mwsService.findAllByProject();
		} else if(by != null && !by.isEmpty() && by.equalsIgnoreCase("department")) {
			list = mwsService.findAllByDepartment();
		} else if(by != null && !by.isEmpty() && by.equalsIgnoreCase("fyyear")) {
			list = mwsService.findAllByYear();
		} else {
			list = mwsService.findAll();
		} 
		model.addAttribute("summaries", list); 
		return "summary";
	}
	 
}
