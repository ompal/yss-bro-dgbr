package net.javaguides.springboot.springsecurity.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false) 
public class QayAheadDto extends ProjectDto {
 
	private long id;
	private Integer totalJobs; 
	private Integer closed;  
	private Integer perClosed; 
	private Integer balance; 
	private String vintageOfBalance; 
}
