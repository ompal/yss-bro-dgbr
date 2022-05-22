package net.javaguides.springboot.springsecurity.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false) 
public class GemProcurmentProgressDto extends ProjectDto {
 
	private long id;
	private Integer procTgt; 
	private Integer achievementTgt;  
	private Integer percentageAnnualTgt; 
	private Integer balance; 
	private String vintageOfBalance; 
}
