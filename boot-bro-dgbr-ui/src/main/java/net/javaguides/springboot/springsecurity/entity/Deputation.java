package net.javaguides.springboot.springsecurity.entity;

import java.util.Date;

import javax.persistence.Entity;
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
@Table(name = "deputation")
public class Deputation extends BaseIdEntity {
 
	private String trade; 
	private Integer nosOfPersOnDeputation; 
	private String remarks; 
	@Temporal(TemporalType.DATE)
	private Date deputationDate;
}
