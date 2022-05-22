package net.javaguides.springboot.springsecurity.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "posting_orders")
public class PostingOrder extends BaseIdEntity {
 
	private Integer duesPosting;
	@Temporal(TemporalType.DATE)
	private Date duesUpToDate;
	private String fyDate;
	
	@ManyToOne(fetch = FetchType.EAGER, targetEntity = Project.class)
    @JoinColumn(name="project_id")
	private Project project;
	 
}
