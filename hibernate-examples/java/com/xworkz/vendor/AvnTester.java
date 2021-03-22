package com.xworkz.vendor;

import java.util.List;

import com.xworkz.vendor.entity.VendorEntity;
import com.xworkz.vendor.repository.VendorRepository;
import com.xworkz.vendor.repository.VendorRepositoryImpl;

public class AvnTester {

	public static void main(String[] args) {
		VendorRepository reps=new VendorRepositoryImpl();

		//Object obj=reps.findByName("Kala Machine Tools");
		//System.out.println(obj);
		
		List<VendorEntity> entity=reps.getAll();
		System.out.println(entity);
		
		reps.deleteById(2);
	}

}
