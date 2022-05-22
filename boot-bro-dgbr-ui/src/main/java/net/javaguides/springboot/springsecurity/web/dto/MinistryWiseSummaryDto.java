package net.javaguides.springboot.springsecurity.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false) 
public class MinistryWiseSummaryDto extends ProjectDto {
 
	private long id;
	private Float allotment; 
	private Float expenditure; 
	private String fyDate;  
}
