package com.wg.hroauth.entities;

import java.io.Serializable;

import lombok.Data;

@Data
public class Role implements Serializable{
	private static final long serialVersionUID = 1760716020745670174L;	
	
	private Long id;
	private String roleName;

}
