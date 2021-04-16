package com.sp.tech.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name="customername",nullable=false)
	private String name;

	private int age;

	@OneToOne(cascade=CascadeType.PERSIST)
	// @JoinColumn(name="address_id")
	private Address address;

	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

}
