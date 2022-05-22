package net.javaguides.springboot.springsecurity.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false) 
public class WestWorkDto extends ProjectDto {
 
	private Long id;
	private Integer brtf_id; 
	private Integer sub_cat_id; 
	private String work_type;  
	private Float awp_tgt; 
	private Integer percentage_norms;
	private Float percentage_achmt;
}
