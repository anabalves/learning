package com.devsuperior.dscatalog.dto;

import com.devsuperior.dscatalog.entities.Role;

import java.io.Serializable;

public class RoleDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String authority;
	
	public RoleDTO() { }

	public RoleDTO(Long id, String authority) {
		super();
		setId(id);
		setAuthority(authority);
	}

	public RoleDTO(Role entity) {
		super();
		setId(entity.getId());
		authority = entity.getAuthority();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	@Override
	public String toString() {
		return "{id=" + getId() + ", authority=" + getAuthority() + "}";
	}

}
