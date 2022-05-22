package net.javaguides.springboot.springsecurity.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false) 
public class DowngradeProgressStatusDto extends ProjectDto {
 
	private long id;
	private Integer approvedForFy; 
	private String financialYear;  
	private Integer carryForwardPreYears; 
	private Integer total; 
	private Integer downgraded; 
	private Integer percentageDowngraded;
	private Integer balanceForDg;
	private String tillYear;
}
