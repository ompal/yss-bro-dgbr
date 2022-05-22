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
public class LikelyAchievementAllExcessDto extends ProjectDto {
 
	private long id;
	private Date uptoDate; 
	private Float originalTgt;  
	private Integer excessShortfallOriginalTgtPercentage; 
	private Integer revisedTgt; 
	private Integer excessShortfallTevisedTgtPercentage;  
}
