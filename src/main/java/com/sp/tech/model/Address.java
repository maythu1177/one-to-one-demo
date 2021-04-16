package com.sp.tech.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="address")
public class Address {
  
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String street;
	
	private int zipCode;

	public Address(String street, int zipCode) {
		super();
		this.street = street;
		this.zipCode = zipCode;
	}
	
	
}
