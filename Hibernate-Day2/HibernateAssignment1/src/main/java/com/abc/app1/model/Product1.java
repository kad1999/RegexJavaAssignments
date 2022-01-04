package com.abc.app1.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product1 {
	@Id
	private Integer id;
	private String name;
	private Double price;
	private String brand;
	
	public Product1() {
		
	}
	public Product1(Integer id, String name, Double price, String brand) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.brand = brand;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Product1 [id=" + id + ", name=" + name + ", price=" + price + ", brand=" + brand + "]";
	}
	
	
}
