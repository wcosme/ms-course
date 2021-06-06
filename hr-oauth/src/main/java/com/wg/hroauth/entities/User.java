package com.wg.hroauth.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import lombok.Data;

@Data
public class User implements Serializable{
	private static final long serialVersionUID = -6092944170107676662L;
	
	private Long id;
	private String name;	
	private String email;
	private String password;	
	private Set<Role> roles = new HashSet<>();

}
