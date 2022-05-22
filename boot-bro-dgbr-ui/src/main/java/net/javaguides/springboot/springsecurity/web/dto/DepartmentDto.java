package net.javaguides.springboot.springsecurity.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false) 
public class DepartmentDto {
 
	private long deptId;
	private String deptName; 
	private String subDeptName;  
	private String deptDesc;  	
	private String subDeptCategory; 
}
