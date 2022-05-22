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
public class NominalRollArmyOfficerDto extends ProjectDto {
 
	private Long id; 
	private String cadre;	   
	private String per_no;   
	private String rank;   
	private String name_officer;  
	private String unit;     
	private String rcc;     
	private String tf;      
	private String area_ci; 
	private Date date_tors;     
	private String addl_qfn; 
	private String dor;
}
