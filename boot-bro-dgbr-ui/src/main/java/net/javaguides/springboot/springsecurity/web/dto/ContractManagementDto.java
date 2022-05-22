package net.javaguides.springboot.springsecurity.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false) 
public class ContractManagementDto extends ProjectDto {
 
	private long id;
	private Integer inprogCeAbove; 
	private Integer delayBeyondComptDt;  
	private Integer percentage; 
}
