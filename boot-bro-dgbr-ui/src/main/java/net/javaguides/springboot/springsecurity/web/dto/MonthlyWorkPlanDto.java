package net.javaguides.springboot.springsecurity.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false) 
public class MonthlyWorkPlanDto extends ProjectDto {
 
	private Long id;
	private String work_type;
	private Integer job_route_no;
	private Integer job_sr_no;
	private Integer awp_tgt_fmn_km;
	private String fy_year;
	private Float april_work_projection;
	private Float april_work_execution;
	private Float may_work_projection;
	private Float may_work_execution;
	private Float june_work_projection;
	private Float june_work_execution;
	private Float july_work_projection;
	private Float july_work_execution;
	private Float august_work_projection;
	private Float august_work_execution;
	private Float sept_work_projection;
	private Float sept_work_execution;
	private Float oct_work_projection;
	private Float oct_work_execution;
	private Float nov_work_projection;
	private Float nov_work_execution;
	private Float dec_work_projection;
	private Float dec_work_execution;
	private Float jan_work_projection;
	private Float jan_work_execution;
	private Float feb_work_projection;
	private Float feb_work_execution;
	private Float march_work_projection;
	private Float march_work_execution;
	private Float upto_march_projection;
	private Float upto_march_execution;
}
