package net.javaguides.springboot.springsecurity.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "project_master")
public class Project extends BaseIdEntity {

	@Column(name = "adg")
	private String adg; 
	@Column(name = "project_name",unique = true,length = 50,nullable = false)
	private String projName; 
	@Column(name = "project_desc")
	private String projDesc; 
	@Column(name = "sub_project_name", length = 50)
	private String subProjName; 
	@Column(name = "sub_sub_project_name", length = 50)
	private String subSubProjName; 
	@Column(name = "project_type", length = 50)
	private String projType; 
}
