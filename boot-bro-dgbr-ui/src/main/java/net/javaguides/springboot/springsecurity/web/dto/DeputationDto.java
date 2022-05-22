package net.javaguides.springboot.springsecurity.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false) 
public class DeputationDto {
 
	private long id;
	private String trade; 
	private Integer nosOfPersOnDeputation; 
	private String remark; 
	private String deputationDate;
}
