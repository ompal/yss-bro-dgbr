package net.javaguides.springboot.springsecurity.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false) 
public class AuctionVEPStatusDto extends ProjectDto {
 
	private long id;
	private Integer prevBalanceDg; 
	private String uptoYear;  
	private Integer auctionedUpto; 
	private String monthYear; 
	private Integer balanceUpto; 
	private String balanceMonthYear;
	private Float percentageBalance;
	
}
