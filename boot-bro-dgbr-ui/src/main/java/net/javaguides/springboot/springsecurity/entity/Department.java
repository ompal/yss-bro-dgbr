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
@Table(name = "department_master")
public class Department extends BaseIdEntity {

	@Column(name = "department_name",length = 50)
	private String deptName; 
	@Column(name = "sub_department_name",length = 50)
	private String subDeptName; 
	@Column(name = "department_desc",length = 50)
	private String deptDesc; 
	@Column(name = "sub_department_category",length = 50)
	private String subDeptCategory; 
}
