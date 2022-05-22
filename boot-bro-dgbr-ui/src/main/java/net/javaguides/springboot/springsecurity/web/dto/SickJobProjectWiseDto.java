package net.javaguides.springboot.springsecurity.web.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false) 
public class SickJobProjectWiseDto extends ProjectDto {
 
	private long id;
	private String vintageOfBalance; 
	private Integer settledTillDate; 
	private Integer balance;  
	private Date periodFrom; 
	private Date periodTo; 
	
}
