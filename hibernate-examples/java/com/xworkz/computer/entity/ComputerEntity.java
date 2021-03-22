package com.xworkz.computer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="computer")
@NamedQueries({
	@NamedQuery(name="findByNameOfComputer" ,query="select computer from ComputerEntity computer where computer.name=:name"),
	@NamedQuery(name="deleteByIdfromComputer",query="delete ComputerEntity computer where computer.id=:id"),
	@NamedQuery(name="getByNameOfComputer" ,query="select computer from ComputerEntity computer where computer.name=:name"),
	@NamedQuery(name="getAllDetails" ,query="select computer from ComputerEntity computer")
})
public class ComputerEntity {
	
	@Id
	@Column(name="ID")
	@GenericGenerator(name="auto",strategy = "increment")
	@GeneratedValue(generator="auto")
	private int id;
	
	@Column(name="BRAND")
	private String brand;
	
	@Column(name="PRICE")
	private double price;
	
	@Column(name="TYPE")
	private String type;
	
	@Column(name="NAME")
	private String name;
	
	public ComputerEntity() {
		System.out.println("craeted ComputerEntity");
	}

	public ComputerEntity(String brand, double price, String type, String name) {
		super();
		this.brand = brand;
		this.price = price;
		this.type = type;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ComputerEntity [id=" + id + ", brand=" + brand + ", price=" + price + ", type=" + type + ", name="
				+ name + "]";
	}

}
