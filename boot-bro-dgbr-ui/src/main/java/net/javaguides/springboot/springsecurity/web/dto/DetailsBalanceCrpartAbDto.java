package net.javaguides.springboot.springsecurity.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false) 
public class DetailsBalanceCrpartAbDto extends ProjectDto {
 
	private long id;
	private String periodFrom; 
	private String periodTo;  
	private String vintageOfJob; 
	private Integer settledTillDt; 
	private Integer balance; 
}
