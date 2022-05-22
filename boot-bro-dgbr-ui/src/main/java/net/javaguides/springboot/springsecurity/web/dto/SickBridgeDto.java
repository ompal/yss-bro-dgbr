package net.javaguides.springboot.springsecurity.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false) 
public class SickBridgeDto extends ProjectDto {
 
	private Long id;  
	private Integer brtf_id;
	private Integer rcc_bcc_dmc_id; 
	private Integer total; 
	private Integer completed; 
	private Integer balance; 
	private Integer plan_to_complete; 
	private String fy_year;
	private Integer vintage_job_more_than_10;
	private Integer vintage_job_more_than_5; 
	private Integer vintage_job_more_than_3;
}
