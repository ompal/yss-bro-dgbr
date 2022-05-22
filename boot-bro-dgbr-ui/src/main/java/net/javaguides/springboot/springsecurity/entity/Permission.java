package net.javaguides.springboot.springsecurity.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "name"))
public class Permission extends BaseIdEntity {

	private String name;
	private String perDesc;

	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "permissions")
	@JsonIgnore
	private Set<Role> roles = new HashSet<>();

	/**
	 * @param name
	 * @param perDesc
	 */
	public Permission(String name, String perDesc) {
		this.name = name;
		this.perDesc = perDesc;
	}

	/**
	 * 
	 */
	public Permission() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPerDesc() {
		return perDesc;
	}

	public void setPerDesc(String perDesc) {
		this.perDesc = perDesc;
	}

}
