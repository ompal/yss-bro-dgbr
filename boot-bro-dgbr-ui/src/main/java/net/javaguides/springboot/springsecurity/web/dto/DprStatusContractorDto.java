package net.javaguides.springboot.springsecurity.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false) 
public class DprStatusContractorDto extends ProjectDto {
 
	private long id;
	private String roadName; 
	private String agency;  
	private Float amtFrom; 
	private Float amtTo; 
	private String pkg;
	private Float cost;
	private String statusCivilWork;
	
}
