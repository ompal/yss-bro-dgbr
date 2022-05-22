package net.javaguides.springboot.springsecurity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.springsecurity.repository.IGenericDao;
import net.javaguides.springboot.springsecurity.web.dto.SickJobDto;
import net.javaguides.springboot.springsecurity.web.dto.SickJobProjectWiseDto;

@Service
public class SickJobService {
 
    
    @Autowired
    private IGenericDao<SickJobDto> sjDao;
    
    @Autowired
    private IGenericDao<SickJobProjectWiseDto> sjpwDao;
 
    
    public List<SickJobDto> findAll(){
    	String query = "SELECT s.id,s.total_jobs AS totalJobs, s.closed,s.per_closed AS perClosed,s.balance ,s.vintage_of_balance AS vintageOfBalance,\n" + 
    			"p.project_name AS projName, p.sub_project_name AS subProjName, p.adg FROM sick_jobs s \n" + 
    			" INNER JOIN project_master p ON s.project_id= p.id"; 
    	return sjDao.findAllByNativeQuery(query, new SickJobDto());
    } 
    
    public List<SickJobProjectWiseDto> findAllProjectWise(){
    	String query = "SELECT s.id,  s.`vintage_of_balance` AS vintageOfBalance, s.`settled_till_date` AS settledTillDate, s.balance,p.`project_name` AS projName,s.`period_from` AS periodFrom ,\n" + 
    			" s.`period_to` AS periodTo  FROM  `sick_jobs_project_wise` s INNER JOIN `project_master` p ON s.`project_id`= p.id"; 
    	return sjpwDao.findAllByNativeQuery(query, new SickJobProjectWiseDto());
    } 
     
}
