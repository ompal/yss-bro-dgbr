package net.javaguides.springboot.springsecurity.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false) 
public class ProjectRevenueCapitalDto extends ProjectDto {
 
	protected Long id;
	private Float totalRevAllot; 
	private Float totalRevExpdr; 
	private Float totalCapAllot; 
	private Float totalCapExpdr;  
	private String fyDate; 
}
