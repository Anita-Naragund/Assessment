package com.xworkz.machine.entity;

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
@Table(name="machine")
@NamedQueries({
	@NamedQuery(name="findByNameOfMachine" ,query="select machine from MachineEntity machine where machine.name=:name"),
	@NamedQuery(name="deleteByIdfromMachine", query="delete MachineEntity machine where machine.id=:id"),
	@NamedQuery(name="getByNameOfMachine" ,query="select machine from MachineEntity machine where machine.name=:name"),
	@NamedQuery(name="getAllDetailsOfMachine" ,query="select machine from MachineEntity machine")
	})
public class MachineEntity {
	
	@Id
	@Column(name="ID")
	@GenericGenerator(name="auto",strategy = "increment")
	@GeneratedValue(generator="auto")
	private int id;
	@Column(name="NAME")
	private String name;
	
	@Column(name="TYPE")
	private String type;
	
	@Column(name="COMPANY_NAME")
	private String companyName;
	
	public MachineEntity() {
		System.out.println("created MachineEntity");
	}

	public MachineEntity(String name, String type, String companyName) {
		super();
		this.name = name;
		this.type = type;
		this.companyName = companyName;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "MachineEntity [id=" + id + ", name=" + name + ", type=" + type + ", companyName=" + companyName + "]";
	}

}
