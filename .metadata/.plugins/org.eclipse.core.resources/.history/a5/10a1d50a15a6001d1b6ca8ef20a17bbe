package com.spring.hibernate.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressId;
	
	@Column(length=100)
	private String street;
	
	private String city;
	
	@Column(name="openOrClosed")
	private boolean isOpen;
	
	@Transient//This tells the hibernate not to save this field in database.
	private double x;
	
	@Temporal(TemporalType.DATE)//@Temporal over a date field tells hibernate, the format in which date needs to be saved.
	private Date addedDate;
	
	//@Lob//it is used to save large object like image
	//private byte[] image;
}
