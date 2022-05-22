package net.javaguides.springboot.springsecurity.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false) 
public class GemDataDto extends ProjectDto {
 
	private long id;
	private Integer procTarget; 
	private Float q1;  
	private Float q2;  	
	private Float q3; 
	private Float q4;  
	private Float total;  	
	private Float annualTargetPercentage; 
}
