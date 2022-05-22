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
@Table(name = "project_wise_revenue_capital")
public class ProjectRevenueCapital extends BaseIdEntity {

	@Column(name = "total_rev_allot")
	private Float totalRevAllot;
	@Column(name = "total_rev_expdr")
	private Float totalRevExpdr; 
	@Column(name = "total_cap_allot")
	private Float totalCapAllot;
	@Column(name = "total_cap_expdr")
	private Float totalCapExpdr; 
	@Column(name = "fy_date")
	private String fyDate; 
	
	@ManyToOne(fetch = FetchType.EAGER, targetEntity = Project.class)
    @JoinColumn(name="project_id")
	private Project project; 
}
