package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shop")
public class Shop {
	@Id
	private int no;
	@Column
	private String name;
	@Column
	private String manager;
	@Column
	private int rank;
	
	public Shop() {
	}
	
	public Shop(int no, String name, String manager, int rank) {
		this.no = no;
		this.name = name;
		this.manager = manager;
		this.rank = rank;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
}
