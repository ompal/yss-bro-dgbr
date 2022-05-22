package net.javaguides.springboot.springsecurity.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "sick_jobs_project_wise")
public class SickJobProjectWise extends BaseIdEntity {
 
	
	private String vintageOfBalance;
	private Integer settledTillDate; 
	private Integer balance; 
	@Temporal(TemporalType.DATE)
	private Date periodFrom; 
	@Temporal(TemporalType.DATE)
	private Date periodTo; 	
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdate; 
	
	@ManyToOne(fetch = FetchType.EAGER, targetEntity = Project.class)
	@JoinColumn(name = "project_id")
	private Project project;
}
