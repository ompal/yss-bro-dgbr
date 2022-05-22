package net.javaguides.springboot.springsecurity.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false) 
public class ProjectDto extends DepartmentDto {
 
	private long projId;
	private String adg;  
	private String projName; 
	private String projDesc; 
	private String subProjName;  
	private String subSubProjName; 
	private String projType; 
}
