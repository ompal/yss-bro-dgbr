package net.javaguides.springboot.springsecurity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.springsecurity.repository.IGenericDao;
import net.javaguides.springboot.springsecurity.web.dto.AnnexivDto;
import net.javaguides.springboot.springsecurity.web.dto.AuctionVEPStatusDto;
import net.javaguides.springboot.springsecurity.web.dto.ContractManagementDto;
import net.javaguides.springboot.springsecurity.web.dto.DetailsBalanceCrpartAbDto;
import net.javaguides.springboot.springsecurity.web.dto.DowngradeProgressStatusDto;
import net.javaguides.springboot.springsecurity.web.dto.DprStatusContractorDto;
import net.javaguides.springboot.springsecurity.web.dto.EastTermTgtDto;
import net.javaguides.springboot.springsecurity.web.dto.GemDataDto;
import net.javaguides.springboot.springsecurity.web.dto.GemProcurmentProgressDto;
import net.javaguides.springboot.springsecurity.web.dto.LikelyAchievementAllDto;
import net.javaguides.springboot.springsecurity.web.dto.LikelyAchievementAllExcessDto;
import net.javaguides.springboot.springsecurity.web.dto.MonthlyWorkPlanDto;
import net.javaguides.springboot.springsecurity.web.dto.NominalRollArmyLadyOfficerDto;
import net.javaguides.springboot.springsecurity.web.dto.NominalRollArmyOfficerDto;
import net.javaguides.springboot.springsecurity.web.dto.NominalRollTfCdrsDto;
import net.javaguides.springboot.springsecurity.web.dto.OutstandingLtarDto;
import net.javaguides.springboot.springsecurity.web.dto.PmdpReportDto;
import net.javaguides.springboot.springsecurity.web.dto.PointForConsiderationDto;
import net.javaguides.springboot.springsecurity.web.dto.SickBridgeDto;
import net.javaguides.springboot.springsecurity.web.dto.WayAheadDto;
import net.javaguides.springboot.springsecurity.web.dto.WestOutstandingsDto;
import net.javaguides.springboot.springsecurity.web.dto.WestWorkDto;

@Service
public class CommonService { 
    
    @Autowired
    private IGenericDao<ContractManagementDto> daoContractManagement;
    
    @Autowired
    private IGenericDao<AuctionVEPStatusDto> daoAuctionVEPStatus;
    
    @Autowired
    private IGenericDao<DetailsBalanceCrpartAbDto> daoDetailsBalanceCrpartAb;
    
    @Autowired
    private IGenericDao<DowngradeProgressStatusDto> daoDowngradeProgressStatus;
    
    @Autowired
    private IGenericDao<GemProcurmentProgressDto> daoGemProcurmentProgress;
    
    @Autowired
    private IGenericDao<LikelyAchievementAllDto> daoLikelyAchievementAll;
    
    @Autowired
    private IGenericDao<LikelyAchievementAllExcessDto> daoLikelyAchievementAllExcess;
    
    @Autowired
    private IGenericDao<GemDataDto> daoGemData;
    
    @Autowired
    private IGenericDao<DprStatusContractorDto> daoDprStatusContractor;
    
    @Autowired
    private IGenericDao<PmdpReportDto> daoPmdpReport;
    
    @Autowired
    private IGenericDao<EastTermTgtDto> daoEastTermTgt;
    
    @Autowired
    private IGenericDao<OutstandingLtarDto> daoOutstandingLtar;
    
    @Autowired
    private IGenericDao<PointForConsiderationDto> daoPointForConsideration;
    
    @Autowired
    private IGenericDao<AnnexivDto> daoAnnexiv;
    
    @Autowired
    private IGenericDao<MonthlyWorkPlanDto> daoMonthlyWorkPlan;
    
    @Autowired
    private IGenericDao<NominalRollArmyLadyOfficerDto> daoNominalRollArmyLadyOfficer;
    
    @Autowired
    private IGenericDao<NominalRollArmyOfficerDto> daoNominalRollArmyOfficer;
    
    @Autowired
    private IGenericDao<NominalRollTfCdrsDto> daoNominalRollTfCdrs;
    
    @Autowired
    private IGenericDao<WayAheadDto> daoWayAhead;
    
    @Autowired
    private IGenericDao<SickBridgeDto> daoSickBridge;
    
    @Autowired
    private IGenericDao<WestWorkDto> daoWestWorkDto;
    
    @Autowired
    private IGenericDao<WestOutstandingsDto> daoWestOutstandings;
    
    public List<ContractManagementDto> getAllContractManagement(){
    	String query ="SELECT c.id,c.inprog_ce_above as inprogCeAbove,c.delay_beyond_compt_dt as delayBeyondComptDt,c.percentage, p.project_name as projName\n" + 
    			"FROM contract_management c INNER JOIN project_master p ON c.project_id =p.id";
    	return daoContractManagement.findAllByNativeQuery(query, new ContractManagementDto());
    }
    
    
    public List<AuctionVEPStatusDto> getAuctionVEPStatus(){
    	String query ="SELECT a.id,a.prev_balance_dg as prevBalanceDg,a.upto_year as uptoYear,a.auctioned_upto as auctionedUpto,a.month_year as monthYear, \n" + 
    			"a.balance_upto as balanceUpto,a.balance_month_year as balanceMonthYear,a.percentage_balance as percentageBalance, p.project_name as projName \n" + 
    			"FROM auction_v_e_p_status a INNER JOIN project_master p ON a.project_id = p.id";
    	return daoAuctionVEPStatus.findAllByNativeQuery(query, new AuctionVEPStatusDto());
    }
    
    
    public List<DetailsBalanceCrpartAbDto> getDetailsBalanceCrpartAb(){
    	String query ="SELECT d.id,d.period_from as periodFrom,d.period_to as periodTo,d.vintage_of_job as vintageOfJob,d.settled_till_dt as settledTillDt,d.balance, p.project_name as projName FROM\n" + 
    			"details_balance_crpart_ab d INNER JOIN project_master p ON d.project_id =p.id";
    	return daoDetailsBalanceCrpartAb.findAllByNativeQuery(query, new DetailsBalanceCrpartAbDto());
    }
    
    
    public List<DowngradeProgressStatusDto> getDowngradeProgressStatus(){
    	String query ="SELECT d.id,d.approved_for_fy as approvedForFy, d.financial_year as financialYear, d.carry_forward_pre_years as carryForwardPreYears,d.total,d.downgraded,d.percentage_downgraded as percentageDowngraded,\n" + 
    			"d.balance_for_dg as balanceForDg,d.till_year as tillYear, p.project_name as projName FROM downgrade_progress_status d INNER JOIN project_master p ON d.project_id =p.id";
    	return daoDowngradeProgressStatus.findAllByNativeQuery(query, new DowngradeProgressStatusDto());
    }
    
    public List<GemProcurmentProgressDto> getGemProcurmentProgress(){
    	String query ="SELECT g.id,g.proc_tgt as procTgt ,g.achievement_tgt as achievementTgt,g.percentage_annual_tgt as percentageAnnualTgt, \n" + 
    			"p.project_name as projName FROM gem_procurment_progress g INNER JOIN project_master p ON g.project_id = p.id";
    	return daoGemProcurmentProgress.findAllByNativeQuery(query, new GemProcurmentProgressDto());
    }
    
    
    public List<LikelyAchievementAllDto> getLikelyAchievementAll(){
    	String query ="SELECT l.id,l.item_of_work AS itemOfWork, l.total_tgt_be AS totalTgtBe,l.total_tgt_be_year AS totalTgtBeYear,\n" + 
    			"l.revised_awp_tgt AS revisedAwpTgt,l.revised_awp_tgt_year AS revisedAwpTgtYear,l.achievement,l.upto_date AS uptoDate,\n" + 
    			"l.total_achievable_upto_month AS totalAchievableUptoMonth ,l.total_achievable_upto_year AS totalAchievableUptoYear ,\n" + 
    			" p.project_name AS projName FROM likely_achievement_all l INNER JOIN  project_master p ON l.project_id = p.id";
    	return daoLikelyAchievementAll.findAllByNativeQuery(query, new LikelyAchievementAllDto());
    }
    
    
    public List<LikelyAchievementAllExcessDto> getLikelyAchievementAllExcess(){
    	String query ="SELECT l.id,l.upto_date AS uptoDate,l.original_tgt AS originalTgt,l.excess_shortfall_original_tgt_percentage AS \n" + 
    			"excessShortfallOriginalTgtPercentage, l.revised_tgt AS revisedTgt,l.exess_shortfall_revised_tgt_percentage AS \n" + 
    			"excessShortfallTevisedTgtPercentage ,p.project_name AS projName FROM likely_achievement_all_excess l INNER JOIN  \n" + 
    			"project_master p ON l.project_id = p.id";
    	return daoLikelyAchievementAllExcess.findAllByNativeQuery(query, new LikelyAchievementAllExcessDto());
    }
    
    
    public List<GemDataDto> getGemData(){
    	String query ="SELECT g.id,g.proc_target AS procTarget,g.q1,g.q2,g.q3,g.q4,g.total,g.annual_target_percentage AS \n" + 
    			"annualTargetPercentage, p.project_name as projName FROM gem_data g INNER JOIN project_master p ON g.project_id = p.id";
    	return daoGemData.findAllByNativeQuery(query, new GemDataDto());
    }
    
    
    public List<DprStatusContractorDto> getDprStatusContr(){
    	String query ="SELECT s.id,s.name_road AS roadName,s.agency,s.amt_from AS amtFrom,s.amt_to AS amtTo,s.package as pkg,s.cost,\n" + 
    			"s.status_civil_work AS statusCivilWork,s.remark, p.project_name AS projName  FROM  status_dpr_contractor s INNER JOIN \n" + 
    			"project_master p ON s.project_id = p.id";
    	return daoDprStatusContractor.findAllByNativeQuery(query, new DprStatusContractorDto());
    }
    
    public List<PmdpReportDto> getPmdpReport(){
    	String query ="SELECT id,pmdp_cost_central_share AS pmdpCostCentralShare,sanctioned_central_share AS sanctionedCentralShare,\n" + 
    			"released_central_share AS releasedCentralShare,utilized_central_share AS utilizedCentralShare,\n" + 
    			"amount_state_share AS amountStateShare,released_state_share AS releasedStateShare FROM pmdp_report";
    	return daoPmdpReport.findAllByNativeQuery(query, new PmdpReportDto());
    }
    
    
    public List<EastTermTgtDto> getEastTermTgt(){
    	String query ="SELECT id,ppnc_id AS ppncId,dte_id AS dteId,formation,term_type AS termType FROM east_term_tgt";
    	return daoEastTermTgt.findAllByNativeQuery(query, new EastTermTgtDto());
    }
    
    
    public List<OutstandingLtarDto> getOutstandingLtar(){
    	String query ="SELECT id,fy_year AS fyYear,ltra_item_number AS ltraItemNumber,subject,\n" + 
    			"concern_dte_section AS concernDteSection,remark FROM outstanding_ltar";
    	return daoOutstandingLtar.findAllByNativeQuery(query, new OutstandingLtarDto());
    }
    
    public List<PointForConsiderationDto> getPointForConsideration(){
    	String query ="SELECT `id`,`sub_heads` AS subHeads,`points` FROM `point_for_consideration`";
    	return daoPointForConsideration.findAllByNativeQuery(query, new PointForConsiderationDto());
    }
    
    public List<AnnexivDto> getAnnexivDto(){
    	String query ="SELECT a.`id`,a.`name_road` AS nameRoad,a.`name_work` AS nameWork,a.`job_no_route` AS jobNoRoute,a.`job_no_sr` AS jobNoSr,\n" + 
    			"a.`remark`,a.`be_year_sr_no` AS beYearSrNo,a.`brdp_prog_no` AS brdpProgNo ,a.`ltrowp_no` AS ltrowpNo,a.`sanctioned_status` AS sanctionedStatus,\n" + 
    			"a.`loc_from_km_to_km` AS locFromKmToKm,a.`type_work` AS typeWork,a.`spec_road_existing` AS specRoadExisting,a.`spec_road_proposed` AS specRoadProposed,a.`pkg`,a.`tf`,a.`unit`,\n" + 
    			"a.`date_of_sanction` AS dateOfSanction,a.`aa_raa_ae_amount` AS aaRaaAeAmount,a.`ts_fmn_km_ci9` AS tsFmnKmCi9,a.`ts_surf_km_ci9` AS tsSurfKmCi9,\n" + 
    			"a.`ts_pmt_wks_inr` AS tsPmtWksInr,a.`ts_maj_br_in_mtr` AS tsMajBrInMtr,a.`ts_tunnel_in_mtf` AS tsTunnelInMtf,a.`ab_fmn_km_ci9` AS abFmnKmCi9,a.`ab_surf_km_ci9` AS abSurfKmCi9,\n" + 
    			"a.`ab_pmt_wks_inr` AS abPmtWksInr,a.`ab_maj_br_in_mtr` AS abMajBrInMtr,a.`ab_tunnel_in_mtf` AS abTunnelInMtf,a.`ab_total_cost_wks` AS abTotalCostWks,a.`awp_fmn_km_ci9` AS awpFmnKmCi9,\n" + 
    			"a.`awp_surf_km_ci` AS awpSurfKmCi,a.`awp_pmt_wks` AS awpPmtWks,a.`awp_maj_br_in_mtr` AS awpMajBrInMtr,a.`awp_tunnel_in_mts` AS awpTunnelInMts,a.`awp_total_cost_wks` AS awpTotalCostWks,\n" + 
    			"a.`major_heads` AS majorHeads,a.`mode_execution` AS modeExecution,a.`ministry`,a.`adgs`,a.`cr_fmn_km_ci9` AS crFmnKmCi9,a.`cr_surf_km_ci9` AS crSurfKmCi9,\n" + 
    			"a.`cr_maj_br_in_mtr` AS crMajBrInMtr,a.`cr_tunnel_in_mtr` AS crTunnelInMtr, p.project_name AS projName FROM\n" + 
    			"`annex_iv` a INNER JOIN project_master p ON a.project_id = p.id";
    	return daoAnnexiv.findAllByNativeQuery(query, new AnnexivDto());
    }
    
    public List<MonthlyWorkPlanDto> getMonthlyWorkPlan(){
    	String query ="SELECT m.`id`,m.`work_type`,m.`job_route_no`,m.`job_sr_no`,m.`awp_tgt_fmn_km`,m.`fy_year`,m.`april_work_projection`,\n" + 
    			"m.`april_work_execution`,m.`may_work_projection`,m.`may_work_execution`,m.`june_work_projection`,m.`june_work_execution`,\n" + 
    			"m.`july_work_projection`,m.`july_work_execution`,m.`august_work_projection`,m.`august_work_execution`,\n" + 
    			"m.`sept_work_projection`,m.`sept_work_execution`,m.`oct_work_projection`,m.`oct_work_execution`,\n" + 
    			"m.`nov_work_projection`,m.`nov_work_execution`,m.`dec_work_projection`,m.`dec_work_execution`,\n" + 
    			"m.`jan_work_projection`,m.`jan_work_execution`,m.`feb_work_projection`,m.`feb_work_execution`,\n" + 
    			"m.`march_work_projection`,m.`march_work_execution`,m.`upto_march_projection`,m.`upto_march_execution`,\n" + 
    			"p.project_name AS projName FROM `monthly_work_plan` m INNER JOIN project_master p ON m.project_id = p.id";
    	return daoMonthlyWorkPlan.findAllByNativeQuery(query, new MonthlyWorkPlanDto());
    }
    
     
    public List<NominalRollArmyLadyOfficerDto> getNominalRollArmyLadyOfficer(){
    	String query ="SELECT n.`id`,n.`cadre`,n.`per_no`,n.`rank`,n.`name_officer`,n.`unit`,n.`rcc`,n.`tf`,n.`area_ci`,\n" + 
    			"n.`date_tors`,n.`addl_qfn`,n.`dor`, p.project_name AS projName FROM`nominal_roll_army_lady_officer` n INNER JOIN \n" + 
    			"project_master p ON n.project_id = p.id";
    	return daoNominalRollArmyLadyOfficer.findAllByNativeQuery(query, new NominalRollArmyLadyOfficerDto());
    }
    
    
    public List<NominalRollArmyOfficerDto> getNominalRollArmyOfficer(){
    	String query ="SELECT n.`id`,n.`cadre`,n.`per_no`,n.`rank`,n.`name_officer`,n.`unit`,n.`rcc`,n.`tf`,n.`area_ci`,\n" + 
    			"n.`date_tors`,n.`addl_qfn`,n.`dor`, p.project_name AS projName FROM`nominal_roll_army_officer` n INNER JOIN \n" + 
    			"project_master p ON n.project_id = p.id";
    	return daoNominalRollArmyOfficer.findAllByNativeQuery(query, new NominalRollArmyOfficerDto());
    }
    
    
    public List<NominalRollTfCdrsDto> getNominalRollTfCdrs(){
    	String query ="SELECT `id`,`pers_no`,`rank`,`name`,`sector`,`unit`,`tors`,`due_for_to`,`remark` FROM `nominal_roll_tf_cdrs`";
    	return daoNominalRollTfCdrs.findAllByNativeQuery(query, new NominalRollTfCdrsDto());
    }
    
    public List<WayAheadDto> getWayAhead(){
    	String query ="SELECT `id`,`forcast_activity`,`fy_date`,`sub_head`,`action_planned` FROM `way_ahead_hs_pr`";
    	return daoWayAhead.findAllByNativeQuery(query, new WayAheadDto());
    }
    
    public List<SickBridgeDto> getSickBridges(){
    	String query ="SELECT s.`id`,s.`brtf_id`,s.`rcc_bcc_dmc_id`,s.`total`,s.`completed`,s.`balance`,s.`plan_to_complete`,\n" + 
    			"s.fy_year,s.`vintage_job_more_than_10`, s.`vintage_job_more_than_5`,s.`vintage_job_more_than_3`, p.project_name \n" + 
    			"AS projName FROM `sick_bridge` s INNER JOIN project_master p ON s.project_id = p.id";
    	return daoSickBridge.findAllByNativeQuery(query, new SickBridgeDto());
    }
    
    
    public List<WestOutstandingsDto> getWestOutstandings(){
    	String query ="SELECT w.`id`,w.`adg_id`,w.`brtf_id`,w.`sub_cat_id`,w.`type_works_matter`,w.`total`,w.`settled_forward`,\n" + 
    			"w.`percentage_settled`, w.`balance`, w.`vintage_of_balance`,p.project_name AS projName FROM `west_outstandings` w INNER JOIN \n" + 
    			"project_master p ON w.project_id = p.id";
    	return daoWestOutstandings.findAllByNativeQuery(query, new WestOutstandingsDto());
    }
    
    public List<WestWorkDto> getWestWorkDto(){
    	String query ="SELECT w.`id`,w.`brtf_id`,w.`sub_cat_id`,w.`work_type`,w.`awp_tgt`,w.`percentage_norms`,w.`percentage_achmt`,\n" + 
    			"p.project_name AS projName FROM `west_work` w INNER JOIN project_master p ON w.project_id = p.id";
    	return daoWestWorkDto.findAllByNativeQuery(query, new WestWorkDto());
    }
    
    
    
}
