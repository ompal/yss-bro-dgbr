package net.javaguides.springboot.springsecurity.web.dto;

import javax.validation.constraints.NotEmpty;


public class PermissionDto {

    @NotEmpty
    private String name;
 
    private String perDesc;

	public PermissionDto(@NotEmpty String name, String perDesc) {
		this.name = name;
		this.perDesc = perDesc;
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

	@Override
	public String toString() {
		return "PermissionDto {name=" + name + ", perDesc=" + perDesc + "}";
	}
    
    
 
}
