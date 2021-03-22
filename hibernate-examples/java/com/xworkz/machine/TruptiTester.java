package com.xworkz.machine;

import java.util.List;

import com.xworkz.machine.entity.MachineEntity;
import com.xworkz.machine.repository.MachineRepository;
import com.xworkz.machine.repository.MachineRepositoryImpl;

public class TruptiTester {
	
	public static void main(String[] args) {
		
		MachineRepository machine=new MachineRepositoryImpl();
		
		//Object obj=machine.findByName("AC");
		//System.out.println(obj);
		
		//Object entity=machine.getByName("LG");
		//System.out.println(entity);
		
		//machine.deleteById(4);
		
		List<MachineEntity> ent=machine.getAll();
		System.out.println(ent);
	}

}
