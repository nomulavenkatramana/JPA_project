package com.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="customer.findAll", query = "select c from Customer c")
@NamedQuery(name="customer.findByName",query="select c from Customer c where c.name= :name")
@NamedQuery(name="customer.nameStartsWithLetter",query="select c from Customer c where name like'r%'")
@NamedQuery(name="customer.nameContainsLetters", query = "select c from Customer c where name like '%ja%'")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private Long mobile;
	private String address;
	
	public Customer() {
		
	}
	
	public Customer(int id, String name, Long mobile, String address) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", mobile=" + mobile + ", address=" + address + "]";
	}
	
	
}
