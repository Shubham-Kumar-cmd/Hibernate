package com.spring.hibernate.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Project {
	@Id
	private int projectId;
	private String projectName;
	
	@ManyToMany(mappedBy = "projects")
	private List<Emp> emps;
	
}
