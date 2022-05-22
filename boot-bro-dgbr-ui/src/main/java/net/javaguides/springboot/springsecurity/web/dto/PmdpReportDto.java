package net.javaguides.springboot.springsecurity.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false) 
public class PmdpReportDto {
 
	private long id;
	private Float pmdpCostCentralShare; 
	private Float sanctionedCentralShare; 
	private Float releasedCentralShare; 
	private Float utilizedCentralShare;
	private Float amountStateShare;
	private Float releasedStateShare;
}
