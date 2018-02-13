package com.app.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Employee {

	@Id
	int id;
	String name;
	@Embedded
    Address addr;
    String skills;

    @Embedded
    @AttributeOverrides({
    	@AttributeOverride(column=@Column(name="Home_flatNo"),name="flatNo"),
    	@AttributeOverride(column=@Column(name="Home_locality"),name="locality"),
    	@AttributeOverride(column=@Column(name="Home_state"),name="state"),
    	@AttributeOverride(column=@Column(name="Home_pinCode"),name="pinCode")

    })
    Address home_addr;
    
    
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
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	public Address getHome_addr() {
		return home_addr;
	}
	public void setHome_addr(Address home_addr) {
		this.home_addr = home_addr;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
    
    

}
