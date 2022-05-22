package net.javaguides.springboot.springsecurity.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "ministry_wise_summary")
public class MinistryWiseSummary extends BaseIdEntity {

	@Column(name = "allotment")
	private Float allotment;
	@Column(name = "expenditure")
	private Float expenditure;
	@Column(name = "fy_date")
	private String fyDate;

	@ManyToOne(fetch = FetchType.EAGER, targetEntity = Project.class)
	@JoinColumn(name = "project_id")
	private Project project;

	@ManyToOne(fetch = FetchType.EAGER, targetEntity = Department.class)
	@JoinColumn(name = "department_id")
	private Department department;
 
}
