package net.javaguides.springboot.springsecurity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.springsecurity.repository.IGenericDao;
import net.javaguides.springboot.springsecurity.web.dto.PostingOrderDto;

@Service
public class PostingOrderService {
 
    
    @Autowired
    private IGenericDao<PostingOrderDto> poDao;
 
    
    public List<PostingOrderDto> findAll(String adg){
    	String query = null;
    	if(adg != null && !adg.isEmpty()) {
    		query = "SELECT o.id AS id,o.dues_posting AS duesPosting,o.dues_up_to_date AS duesUpToDate,fy_date AS fyDate,p.id AS projId,p.adg AS adg,\n" + 
        			"p.project_name AS projName, p.sub_project_name AS subProjName ,p.sub_sub_project_name AS subSubProjName,p.project_type AS projType\n" + 
        			" FROM posting_orders o INNER JOIN project_master p ON o.project_id= p.id WHERE p.adg = '"+adg+"'";
    	} else {
    		query = "SELECT o.id AS id,o.dues_posting AS duesPosting,o.dues_up_to_date AS duesUpToDate,fy_date AS fyDate,p.id AS projId,p.adg AS adg,\n" + 
        			"p.project_name AS projName, p.sub_project_name AS subProjName ,p.sub_sub_project_name AS subSubProjName,p.project_type AS projType\n" + 
        			" FROM posting_orders o INNER JOIN project_master p ON o.project_id= p.id";
    	}
    	return executeQuery(query);
    }
     
    
    public List<PostingOrderDto> findTotalPosting(String adg){ 
    	String query = null;
    	if(adg != null && !adg.isEmpty()) {
    		query = "SELECT SUM(o.dues_posting) AS duesPosting , o.dues_up_to_date AS duesUpToDate, p.adg AS adg, fy_date AS fyDate   FROM `posting_orders` o INNER JOIN \n" + 
    				" project_master p ON o.project_id= p.id WHERE p.adg = '"+adg+"' GROUP BY o.dues_up_to_date";
    	} else {
    		query = "SELECT SUM(o.dues_posting) AS duesPosting , o.dues_up_to_date AS duesUpToDate, p.adg AS adg, fy_date AS fyDate   FROM `posting_orders` o INNER JOIN \n" + 
        			" project_master p ON o.project_id= p.id GROUP BY o.dues_up_to_date, p.adg ORDER BY p.adg";
    	}
    	return executeQuery(query);
    }
     
	
	private List<PostingOrderDto> executeQuery(String query){
		return poDao.findAllByNativeQuery(query, new PostingOrderDto());
	}
}
