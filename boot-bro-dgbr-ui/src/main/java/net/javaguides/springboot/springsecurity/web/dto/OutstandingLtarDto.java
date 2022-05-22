package net.javaguides.springboot.springsecurity.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false) 
public class OutstandingLtarDto {
 
	private long id;
	private String fyYear; 
	private String ltraItemNumber; 
	private String subject; 
	private String concernDteSection;
	private String remark; }
