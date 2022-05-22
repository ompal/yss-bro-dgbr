package net.javaguides.springboot.springsecurity.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.javaguides.springboot.springsecurity.entity.User;
import net.javaguides.springboot.springsecurity.service.CommonService;
import net.javaguides.springboot.springsecurity.service.DeputationService;
import net.javaguides.springboot.springsecurity.service.ProjectRevenueCapitalService;
import net.javaguides.springboot.springsecurity.service.UserService;
import net.javaguides.springboot.springsecurity.web.dto.ProjectRevenueCapitalDto;

@Controller
public class MainController {
	
	@Autowired
	private ProjectRevenueCapitalService prcService;
	
	@Autowired
	private DeputationService dpService;
	
	@Autowired
	private CommonService commonService1;
	
	@Autowired
	private UserService userService;

    @GetMapping("/")
    public String root(Model model) {
    	List<ProjectRevenueCapitalDto> list = prcService.findTotal();
		model.addAttribute("totalRevenues", list); 
		model.addAttribute("totalDeputation",dpService.findTodal().get(0).getNosOfPersOnDeputation());
		List<User> users = userService.findAll();
		model.addAttribute("users", users);
		model.addAttribute("contractorDprStatus", commonService1.getDprStatusContr());  
		return "dashboard";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }
 
}
