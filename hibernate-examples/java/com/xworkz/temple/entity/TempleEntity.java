package com.xworkz.temple.entity;

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
@Table(name="temple")
@NamedQueries({
	@NamedQuery(name="findByName" ,query="select temple from TempleEntity temple where temple.name=:name"),
	@NamedQuery(name="deleteById", query="delete TempleEntity temple where temple.id=:id"),
	@NamedQuery(name="getByName" ,query="select temple from TempleEntity temple where temple.name=:name"),
	@NamedQuery(name="getAll" ,query="select temple from TempleEntity temple")
	})
public class TempleEntity {
	
	@Id
	@Column(name="ID")
	@GenericGenerator(name="auto",strategy = "increment")
	@GeneratedValue(generator="auto")
	private int id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="LOCATION")
	private String location;
	
	@Column(name="NO_OF_VISITORS_PER_DAY")
	private int noOfVisitiorsPerDay;
	
	@Column(name="NO_OF_PRIEST")
	private int noOfPriest;
	
	public TempleEntity() {
		System.out.println("created TempleEntity");
	}

	public TempleEntity(String name, String location, int noOfVisitiorsPerDay, int noOfPriest) {
		super();
		this.name = name;
		this.location = location;
		this.noOfVisitiorsPerDay = noOfVisitiorsPerDay;
		this.noOfPriest = noOfPriest;
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

	public int getNoOfVisitiorsPerDay() {
		return noOfVisitiorsPerDay;
	}

	public void setNoOfVisitiorsPerDay(int noOfVisitiorsPerDay) {
		this.noOfVisitiorsPerDay = noOfVisitiorsPerDay;
	}

	public int getNoOfPriest() {
		return noOfPriest;
	}

	public void setNoOfPriest(int noOfPriest) {
		this.noOfPriest = noOfPriest;
	}

	@Override
	public String toString() {
		return "TempleEntity [id=" + id + ", name=" + name + ", location=" + location + ", noOfVisitiorsPerDay="
				+ noOfVisitiorsPerDay + ", noOfPriest=" + noOfPriest + "]";
	}
	
	

}
