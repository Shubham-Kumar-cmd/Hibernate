package com.hibernate.model;

import java.util.Date;
import java.util.Random;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Notes {
	@Id
	private int id;
	private String title;
	
	@Column(length = 1500)
	private String content;
	private Date currentDate;
	
	public Notes(String title, String content, Date currentDate) {
		super();
		this.id = new Random().nextInt(10000);
		this.title = title;
		this.content = content;
		this.currentDate = currentDate;
	}
}
