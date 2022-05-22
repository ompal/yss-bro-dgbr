package net.javaguides.springboot.springsecurity.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false) 
public class SickJobDto extends ProjectDto {
 
	private Long id;  
	private Integer totalJobs;
	private Integer closed; 
	private Integer perClosed; 
	private Integer balance; 
	private String vintageOfBalance; 
}
