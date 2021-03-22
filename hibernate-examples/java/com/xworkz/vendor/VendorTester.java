package com.xworkz.vendor;

import com.xworkz.vendor.entity.VendorEntity;
import com.xworkz.vendor.repository.VendorRepository;
import com.xworkz.vendor.repository.VendorRepositoryImpl;

public class VendorTester {
	
	public static void main(String[] args) {
		
		VendorEntity entity=new VendorEntity("Aasi Media", "Chennai", 55.2);
		
		VendorEntity entity2=new VendorEntity("Athicas Food Products", "Bengalore", 12.5);
		
		VendorEntity entity3=new VendorEntity("Kala Machine Tools", "Bengalore", 68.6);
		
		VendorEntity entity4=new VendorEntity("Phoenix Products", "Hydrabad", 32.8);
		
		VendorRepository reps=new VendorRepositoryImpl();
		reps.save(entity);
		reps.save(entity2);
		reps.save(entity3);
		reps.save(entity4);
	}

}
