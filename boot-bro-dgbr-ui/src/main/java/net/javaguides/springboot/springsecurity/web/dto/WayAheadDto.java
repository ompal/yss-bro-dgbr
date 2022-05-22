package net.javaguides.springboot.springsecurity.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false) 
public class WayAheadDto extends ProjectDto {
 
	private Long id; 
	private String forcast_activity;   
	private String fy_date;    
	private String sub_head;            
	private String action_planned;
	
}
