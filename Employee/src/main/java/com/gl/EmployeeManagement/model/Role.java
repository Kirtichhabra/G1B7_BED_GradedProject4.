package com.gl.EmployeeManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity //define a class can be mapped to a table
@Table(name = "roles")
@Data
public class Role {
	@Id
	@Column(name = "role_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY) // indicates the auto increment
	private Integer id;
	@Column(name = "name")
	private String name;

}
