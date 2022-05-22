package net.javaguides.springboot.springsecurity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.springsecurity.repository.IGenericDao;
import net.javaguides.springboot.springsecurity.web.dto.ProjectRevenueCapitalDto;

@Service
public class ProjectRevenueCapitalService {
 
    
    @Autowired
    private IGenericDao<ProjectRevenueCapitalDto> prcDao;
 
    
    public List<ProjectRevenueCapitalDto> findAll(){
    	String query = "SELECT pr.id AS id, p.id AS projId, p.project_name AS projName, pr.total_rev_allot AS totalRevAllot,pr.total_rev_expdr AS totalRevExpdr,pr.total_cap_allot AS totalCapAllot, \n" + 
    			"pr.total_cap_expdr AS total_cap_expdr,pr.fy_date AS fyDate FROM project_wise_revenue_capital pr INNER JOIN project_master p ON pr.project_id = p.id";
    	return executeQuery(query);
    }


	public List<ProjectRevenueCapitalDto> findTotal() {
		String query ="SELECT SUM(total_cap_allot) AS totalCapAllot, SUM(total_cap_expdr)AS totalCapExpdr, SUM(total_rev_allot) AS totalRevAllot,\n" + 
				"SUM(total_rev_expdr) AS totalRevExpdr, fy_date AS fyDate FROM project_wise_revenue_capital GROUP BY fy_date";
		return executeQuery(query);
	}
	
	
	private List<ProjectRevenueCapitalDto> executeQuery(String query){
		return prcDao.findAllByNativeQuery(query, new ProjectRevenueCapitalDto());
	}
}
