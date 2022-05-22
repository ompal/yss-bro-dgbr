package net.javaguides.springboot.springsecurity.entity;

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
@Table(name = "sick_jobs")
public class SickJob extends BaseIdEntity {
 
	private Integer totalJobs; 
	private Integer closed;  
	private Integer perClosed; 
	private Integer balance; 
	private String vintageOfBalance;
	
	@ManyToOne(fetch = FetchType.EAGER, targetEntity = Project.class)
	@JoinColumn(name = "project_id")
	private Project project;
}
