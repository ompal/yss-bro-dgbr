package net.javaguides.springboot.springsecurity.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false) 
public class AdvisoriesDto {
 
	private long id;
	private String issued_by; 
	private String advisory; 
	private String date_of_issue;  
}
