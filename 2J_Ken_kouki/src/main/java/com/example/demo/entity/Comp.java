package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comp")
public class Comp {
	@Id
	private int compnumber;
	@Column(name="compname")
	private String name;
	
	public Comp() {
	}
	
	public Comp(int compnumber, String name) {
		this.compnumber = compnumber;
		this.name = name;
	}

	public int getCompnumber() {
		return compnumber;
	}

	public void setCompnumberd(int compnumber) {
		this.compnumber = compnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
