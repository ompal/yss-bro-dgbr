package net.javaguides.springboot.springsecurity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.springsecurity.repository.IGenericDao;
import net.javaguides.springboot.springsecurity.web.dto.MinistryWiseSummaryDto;

@Service
public class MinisteryWiseSummaryService {
 
    
    @Autowired
    private IGenericDao<MinistryWiseSummaryDto> mwsDao;
 
    
    public List<MinistryWiseSummaryDto> findAll(){
    	String query = "SELECT m.id AS id ,m.allotment AS allotment,m.expenditure AS expenditure,m.fy_date AS fyDate, p.id AS projId, p.project_name AS projName,\n" + 
    			"d.id AS deptId,d.department_name AS deptName, d.sub_department_name AS subDeptName,d.sub_department_category AS subDeptCategory FROM ministry_wise_summary m INNER JOIN \n" + 
    			"project_master p ON m.project_id = p.id INNER JOIN department_master d ON m.department_id = d.id";
    	return executeQuery(query);
    }
    
    public List<MinistryWiseSummaryDto> findAllByProject(){
    	String query = "SELECT SUM(m.allotment) AS allotment, SUM(m.expenditure) AS expenditure, p.id AS projId, p.project_name AS projName FROM ministry_wise_summary m INNER JOIN \n" + 
    			"project_master p ON m.project_id = p.id GROUP BY p.project_name";
    	return executeQuery(query);
    }
    
    
    public List<MinistryWiseSummaryDto> findAllByDepartment(){
    	String query = "SELECT SUM(m.allotment) AS allotment ,SUM(m.expenditure) AS expenditure,d.id AS deptId,d.department_name AS deptName,\n" + 
    			"d.sub_department_name AS subDeptName,d.sub_department_category AS subDeptCategory FROM ministry_wise_summary m \n" + 
    			"INNER JOIN department_master d ON m.department_id = d.id GROUP BY d.department_name,d.sub_department_name;";
    	return executeQuery(query);
    }
    
    
    public List<MinistryWiseSummaryDto> findAllByYear(){
    	String query = "SELECT SUM(allotment) AS allotment, SUM(expenditure) AS expenditure , fy_date AS fyDate FROM ministry_wise_summary GROUP BY fy_date";
    	return executeQuery(query);
    }

 
	
	private List<MinistryWiseSummaryDto> executeQuery(String query){
		return mwsDao.findAllByNativeQuery(query, new MinistryWiseSummaryDto());
	}
}
