package net.javaguides.springboot.springsecurity.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.javaguides.springboot.springsecurity.service.PostingOrderService;

@Controller
@RequestMapping("/posting")
public class PostingOrderController {
 
	@Autowired
	private PostingOrderService poService;
  
	@GetMapping()
	public String getAllPosting(@RequestParam(name="adg",required = false) String adg,Model model) { 
		model.addAttribute("postings", poService.findAll(adg)); 
		model.addAttribute("total", poService.findTotalPosting(adg)); 
		return "posting";
	}
	 
}
