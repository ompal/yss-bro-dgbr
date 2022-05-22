package net.javaguides.springboot.springsecurity.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class WestOutstandingsDto extends ProjectDto {

	private Long id;
	private String adg_id;
	private Integer brtf_id;
	private String sub_cat_id;
	private String type_works_matter;
	private Integer total;
	private Integer settled_forward;
	private String percentage_settled;
	private String balance;
	private String vintage_of_balance;
}
