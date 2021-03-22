package com.xworkz.computer;

import java.util.List;

import com.xworkz.computer.entity.ComputerEntity;
import com.xworkz.computer.repository.ComputerRepository;
import com.xworkz.computer.repository.ComputerRepositoryImpl;

public class NikitaTester {

	public static void main(String[] args) {
		
		ComputerRepository resp=new ComputerRepositoryImpl();
		
		//Object entity=resp.findByName("DELL");
		//System.out.println(entity);
		//resp.deleteById(4);
		
		//Object entity=resp.getByName("Lenovo");
		//System.out.println(entity);
		
		List<ComputerEntity> ent=resp.getAll();
		System.out.println(ent);
	}

}
