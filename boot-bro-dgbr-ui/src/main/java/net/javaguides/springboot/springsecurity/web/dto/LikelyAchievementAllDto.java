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
public class LikelyAchievementAllDto extends ProjectDto {
 
	private long id;
	private String itemOfWork; 
	private Float totalTgtBe;  
	private String totalTgtBeYear; 
	private Float revisedAwpTgt; 
	private Date revisedAwpTgtYear; 
	private Float achievement; 
	private Date uptoDate;
	private Float totalAchievableUptoMonth;
	private Date totalAchievableUptoYear;
}
