package net.javaguides.springboot.springsecurity.web.dto;

import java.util.List;

import javax.validation.constraints.NotEmpty;

 
public class RoleDto {

    @NotEmpty
    private String name;

    @NotEmpty
    private String roleDesc;

    List<PermissionDto> permissions;

	public RoleDto(@NotEmpty String name, @NotEmpty String roleDesc, List<PermissionDto> permissions) {
		this.name = name;
		this.roleDesc = roleDesc;
		this.permissions = permissions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoleDesc() {
		return roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	public List<PermissionDto> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<PermissionDto> permissions) {
		this.permissions = permissions;
	}

	@Override
	public String toString() {
		return "RoleDto {name=" + name + ", roleDesc=" + roleDesc + ", permissions=" + permissions + "}";
	}
    
    
}
