package com.xworkz.person.entity;

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
@Table(name="person")
@NamedQueries({
	@NamedQuery(name="findByNameOfPerson" ,query="select person from PersonEntity person where person.name=:name"),
	@NamedQuery(name="deleteByIdfromPerson", query="delete PersonEntity person where person.id=:id"),
	@NamedQuery(name="getAllDetailsOfPerson" ,query="select person from PersonEntity person")
	})
public class PersonEntity {
	
	@Id
	@Column(name="ID")
	@GenericGenerator(name="auto",strategy = "increment")
	@GeneratedValue(generator="auto")
	private int id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="PHONE_NO")
	private int phoneNo;

	public PersonEntity() {
		System.out.println("created PersonEntity");
	}

	public PersonEntity(String name, String email, int phoneNo) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "PersonEntity [id=" + id + ", name=" + name + ", email=" + email + ", phoneNo=" + phoneNo + "]";
	}
	
	
}
