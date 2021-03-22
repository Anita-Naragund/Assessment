package com.xworkz.vendor.entity;

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
@Table(name="vendor")
@NamedQueries({
	@NamedQuery(name="findByNameOfVendor" ,query="select vendor from VendorEntity vendor where vendor.name=:name"),
	@NamedQuery(name="deleteByIdfromVendor", query="delete VendorEntity vendor where vendor.id=:id"),
	@NamedQuery(name="getAllDetailsOfVendor" ,query="select vendor from VendorEntity vendor")
	})
public class VendorEntity {
	
	
	@Id
	@Column(name="ID")
	@GenericGenerator(name="auto",strategy = "increment")
	@GeneratedValue(generator="auto")
	private int id;
	private String name;
	private String location;
	private double price;
	
	public VendorEntity() {
		System.out.println("created VendorEntity");
	}

	public VendorEntity(String name, String location, double price) {
		super();
		this.name = name;
		this.location = location;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "VendorEntity [id=" + id + ", name=" + name + ", location=" + location + ", price=" + price + "]";
	}
	
	

}
