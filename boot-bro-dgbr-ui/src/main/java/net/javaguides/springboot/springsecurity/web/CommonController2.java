package net.javaguides.springboot.springsecurity.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.javaguides.springboot.springsecurity.service.CommonService2;

@Controller 
public class CommonController2 {
 
	@Autowired
	private CommonService2 commonService2;
   
	
	@GetMapping("/advisories")
	public String getAdvisories(Model model) { 
		model.addAttribute("advisories", commonService2.getAdvisories());  
		return "advisorie";
	}
	
	
	@GetMapping("/agencyWiseWork")
	public String getAgencyWiseWor(Model model) { 
		model.addAttribute("agencyWiseWorks", commonService2.getAgencyWiseWork());  
		return "agencyWiseWork";
	}
	 
}
