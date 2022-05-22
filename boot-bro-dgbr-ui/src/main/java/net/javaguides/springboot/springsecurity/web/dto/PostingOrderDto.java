package net.javaguides.springboot.springsecurity.web.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false) 
public class PostingOrderDto extends ProjectDto {
 
	private long id;
	private Integer duesPosting; 
	@JsonFormat(pattern = "Mon-DD-YYYY")
	private Date duesUpToDate;
	private String fyDate; 
}
