package net.javaguides.springboot.springsecurity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.springsecurity.repository.IGenericDao;
import net.javaguides.springboot.springsecurity.web.dto.AdvisoriesDto;
import net.javaguides.springboot.springsecurity.web.dto.AgencyWiseWorkDto;

@Service
public class CommonService2 { 
    
    @Autowired
    private IGenericDao<AdvisoriesDto> daoAdvisories;
    
    @Autowired
    private IGenericDao<AgencyWiseWorkDto> daoAgencyWiseWork;
     
    
    public List<AdvisoriesDto> getAdvisories(){
    	String query ="SELECT `id`,`issued_by` ,`advisory`,`date_of_issue`  FROM `advisories`";
    	return daoAdvisories.findAllByNativeQuery(query, new AdvisoriesDto());
    }
    
    
    public List<AgencyWiseWorkDto> getAgencyWiseWork(){
    	String query ="SELECT a.id,a.agency_name,a.sanction_status,a.name_road,a.name_work,a.loc_from_km_to_km,\n" + 
    			"a.job_no_route,a.job_no_sr,a.aa_raa_ae_amount,a.ts_fmn_km_ci9,a.ts_surf_km_ci9,a.ts_pmt_wks_inr,\n" + 
    			"a.ts_maj_br_in_mtr,a.ts_tunnel_in_mtf,a.ab_fmn_km_ci9,a.ab_surf_km_ci9,a.ab_pmt_wks_inr,\n" + 
    			"a.ab_maj_br_in_mtr,a.ab_tunnel_in_mtf,a.ab_total_cost_wks,a.remark, p.project_name AS projName FROM\n" + 
    			"agency_wise_work a INNER JOIN project_master p ON a.project_id = p.id";
    	return daoAgencyWiseWork.findAllByNativeQuery(query, new AgencyWiseWorkDto());
    }
     
     
}
