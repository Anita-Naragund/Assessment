package com.xworkz.machine;

import com.xworkz.machine.entity.MachineEntity;
import com.xworkz.machine.repository.MachineRepository;
import com.xworkz.machine.repository.MachineRepositoryImpl;

public class MachineTester {
	
	
	public static void main(String[] args) {
		
		MachineEntity entity=new MachineEntity("Refrigerator", "Electronic", "Sony");
		
		MachineEntity entity2=new MachineEntity("Washing machine", "Electronic", "LG");
		
		MachineEntity entity3=new MachineEntity("TV", "Electronic", "Sony");
		
		MachineEntity entity4=new MachineEntity("AC", "Electronic", "LG");
		
		MachineRepository resp=new MachineRepositoryImpl();
		
		resp.save(entity);
		resp.save(entity2);
		resp.save(entity3);
		resp.save(entity4);
		
		
	}

}
