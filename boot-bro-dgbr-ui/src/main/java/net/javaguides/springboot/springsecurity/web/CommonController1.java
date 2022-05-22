package net.javaguides.springboot.springsecurity.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.javaguides.springboot.springsecurity.service.CommonService;

@Controller 
public class CommonController1 {
 
	@Autowired
	private CommonService commonService1;
  
	@GetMapping("/contract-management")
	public String getContractManagement(Model model) { 
		model.addAttribute("contractManagements", commonService1.getAllContractManagement());  
		return "contractManagement";
	}
	
	
	@GetMapping("/auctionVEPStatus")
	public String getAuctionVEPStatus(Model model) { 
		model.addAttribute("auctionVEPStatus", commonService1.getAuctionVEPStatus());  
		return "auctionVEPStatus";
	}
	
	@GetMapping("/detailsBalance")
	public String getDetailsBalanceCrpartAb(Model model) { 
		model.addAttribute("detailsBalances", commonService1.getDetailsBalanceCrpartAb());  
		return "detailsBalance";
	}
	
	
	@GetMapping("/downgradeProgressStatus")
	public String getDowngradeProgressStatus(Model model) { 
		model.addAttribute("downgradeProgress", commonService1.getDowngradeProgressStatus());  
		return "progressStatus";
	}
	
	
	@GetMapping("/gemProcurmentProgress")
	public String getGemProcurmentProgress(Model model) { 
		model.addAttribute("gemProcurments", commonService1.getGemProcurmentProgress());  
		return "gemProcurment";
	}
	
	@GetMapping("/likelyAchievement")
	public String getLikelyAchievement(Model model) { 
		model.addAttribute("likelyAchievements", commonService1.getLikelyAchievementAll());  
		return "likelyAchievement";
	}
	
	@GetMapping("/likelyAchievementExcess")
	public String getLikelyAchievementExcess(Model model) { 
		model.addAttribute("likelyAchievementExcess", commonService1.getLikelyAchievementAllExcess());  
		return "likelyAchievementExcess";
	}
	
	@GetMapping("/gemData")
	public String getLikelyGemData(Model model) { 
		model.addAttribute("gemDatas", commonService1.getGemData());  
		return "gemData";
	}
	
	
	@GetMapping("/contractorDprStatus")
	public String getContractorDprStatus(Model model) { 
		model.addAttribute("contractorDprStatus", commonService1.getDprStatusContr());  
		return "contractorDprStatus";
	}
	
	@GetMapping("/pmdpReports")
	public String getPmdpReports(Model model) { 
		model.addAttribute("pmdpReports", commonService1.getPmdpReport());  
		return "pmdpReport";
	}
	
	@GetMapping("/eastTermTgt")
	public String getEastTermTgt(Model model) { 
		model.addAttribute("eastTermTgts", commonService1.getEastTermTgt());  
		return "eastTermTgt";
	}
	
	@GetMapping("/outstandingLtar")
	public String getoutstandingLtar(Model model) { 
		model.addAttribute("outstandingLtars", commonService1.getOutstandingLtar());  
		return "outstandingLtar";
	}
	
	
	@GetMapping("/pointForConsideration")
	public String getPointForConsideration(Model model) { 
		model.addAttribute("pointForConsiderations", commonService1.getPointForConsideration());  
		return "pointForConsideration";
	}
	
	
	@GetMapping("/annexiv")
	public String getAnnexiv(Model model) { 
		model.addAttribute("annexivs", commonService1.getAnnexivDto());  
		return "annexiv";
	}
	
	@GetMapping("/monthlyWorkPlan")
	public String getMonthlyWorkPlan(Model model) { 
		model.addAttribute("workPlans", commonService1.getMonthlyWorkPlan());  
		return "workPlan";
	}
	
	@GetMapping("/nominalRollArmyLadyOfficer")
	public String getNominalRollArmyLadyOfficer(Model model) { 
		model.addAttribute("nominalRollArmyLadyOfficers", commonService1.getNominalRollArmyLadyOfficer());  
		return "armyLadyOfficer";
	}
	
	@GetMapping("/nominalRollArmyOfficer")
	public String getNominalRollArmyOfficer(Model model) { 
		model.addAttribute("nominalRollArmyOfficers", commonService1.getNominalRollArmyOfficer());  
		return "armyOfficer";
	}
	
	
	@GetMapping("/nominalRollTfCdrs")
	public String getNominalRollTfCdrs(Model model) { 
		model.addAttribute("nominalRollTfCdrs", commonService1.getNominalRollTfCdrs());  
		return "nominalTfCdrs";
	}
	
	@GetMapping("/sickBridge")
	public String getSickBridge(Model model) { 
		model.addAttribute("sickBridges", commonService1.getSickBridges());  
		return "sickBridge";
	}
	
	@GetMapping("/westOutstandings")
	public String getWestOutstandings(Model model) { 
		model.addAttribute("westOutstandings", commonService1.getWestOutstandings());  
		return "westOutstanding";
	}
	
	@GetMapping("/westWork")
	public String getWestWork(Model model) { 
		model.addAttribute("westWorks", commonService1.getWestWorkDto());  
		return "westWork";
	}
	 
}
