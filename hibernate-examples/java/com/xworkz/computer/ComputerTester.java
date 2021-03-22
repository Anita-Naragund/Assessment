package com.xworkz.computer;

import com.xworkz.computer.entity.ComputerEntity;
import com.xworkz.computer.repository.ComputerRepository;
import com.xworkz.computer.repository.ComputerRepositoryImpl;

public class ComputerTester {

	public static void main(String[] args) {
		
		ComputerEntity entity=new ComputerEntity("HP", 45000, "windows", "HP");
		ComputerEntity entity2=new ComputerEntity("Lenovo", 62000, "windows", "Intel");
		ComputerEntity entity3=new ComputerEntity("Dell", 56000, "MAC", "Dell");
		ComputerEntity entity4=new ComputerEntity("Acer", 38000, "windows", "Acer");
		ComputerEntity entity5=new ComputerEntity("Apple", 150000, "MAC", "Apple");
		
		ComputerRepository resp=new ComputerRepositoryImpl();
		
		resp.save(entity);
		resp.save(entity2);
		resp.save(entity3);
		resp.save(entity4);
		resp.save(entity5);
		
		
		
	}
}
