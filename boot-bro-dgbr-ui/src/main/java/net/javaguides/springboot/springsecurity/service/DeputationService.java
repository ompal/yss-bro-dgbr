package net.javaguides.springboot.springsecurity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.springsecurity.repository.IGenericDao;
import net.javaguides.springboot.springsecurity.web.dto.DeputationDto;

@Service
public class DeputationService {
 
    
    @Autowired
    private IGenericDao<DeputationDto> dpDao;
 
    
    public List<DeputationDto> findAll(){
    	String query = "SELECT id,trade,nos_of_pers_on_deputation AS nosOfPersOnDeputation ,remarks,deputation_date AS  deputationDate FROM deputation"; 
    	return executeQuery(query);
    }
    
    public List<DeputationDto> findTodal(){
    	String query = "SELECT SUM(nos_of_pers_on_deputation) AS nosOfPersOnDeputation FROM deputation"; 
    	return executeQuery(query);
    }
      
	private List<DeputationDto> executeQuery(String query){
		return dpDao.findAllByNativeQuery(query, new DeputationDto());
	}
}
