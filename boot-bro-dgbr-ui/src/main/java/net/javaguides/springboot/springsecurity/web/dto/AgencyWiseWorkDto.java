package net.javaguides.springboot.springsecurity.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false) 
public class AgencyWiseWorkDto extends ProjectDto {
 
	private Long id;
	private String agency_name;
	private String sanction_status;
	private String name_road;
	private String name_work;
	private Long loc_from_km_to_km;
	private String job_no_route;
	private String job_no_sr;
	private Integer aa_raa_ae_amount;
	private Integer ts_fmn_km_ci9;
	private Integer ts_surf_km_ci9;
	private Integer ts_pmt_wks_inr;
	private Integer ts_maj_br_in_mtr;
	private Integer ts_tunnel_in_mtf;
	private Integer ab_fmn_km_ci9;
	private Integer ab_surf_km_ci9;
	private Integer ab_pmt_wks_inr;
	private Integer ab_maj_br_in_mtr;
	private Integer ab_tunnel_in_mtf;
	private Integer ab_total_cost_wks;
	private String remark;
}
