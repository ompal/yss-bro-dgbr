package net.javaguides.springboot.springsecurity.web.dto;
 
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false) 
public class NominalRollTfCdrsDto {
 
	private Long id; 
	private String pers_no; 
	private String rank;   
	private String name;   
	private String sector; 
	private String unit;    
	private String tors;    
	private String due_for_to;  
	private String remark;
}
