package com.spring.hibernate.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Emp {
	@Id
	private int empId;
	private String empName;
	
	@ManyToMany
	@JoinTable
	(
			name="emp_project_relation",
			joinColumns = {@JoinColumn(name="emp_id")},
			inverseJoinColumns = {@JoinColumn(name="project_id")}
	)
	private List<Project> projects; 
}
