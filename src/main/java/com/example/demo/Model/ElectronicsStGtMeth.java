package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.*;

@Entity
@Table(name="Electronics")
public class ElectronicsStGtMeth {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Sl;
	@Column(name = "Name")
	private String Name;
	@Column(name = "Catogery")
	private String Catogery;
	@Column(name = "Price")
	private int Price;
	
	
	public ElectronicsStGtMeth() {
		super();
	}
	public ElectronicsStGtMeth(int sl, String name, String catogery, int price) {
		super();
		Sl = sl;
		Name = name;
		Catogery = catogery;
		Price = price;
	}
	public int getId() {
		return Sl;
	}
	public void setId(int sl) {
		Sl = sl;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCatogery() {
		return Catogery;
	}
	public void setCatogery(String catogery) {
		Catogery = catogery;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	
	
	

}
