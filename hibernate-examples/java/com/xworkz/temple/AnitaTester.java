package com.xworkz.temple;

import java.util.List;

import com.xworkz.temple.entity.TempleEntity;
import com.xworkz.temple.repository.TempleRepository;
import com.xworkz.temple.repository.TempleRepositoryImpl;

public class AnitaTester {

	public static void main(String[] args) {
		TempleRepository reps=new TempleRepositoryImpl();
		
		Object entity=reps.getByName("Venkateshwara");
		//System.out.println(entity);
		
		//reps.deleteById(6);
		
		List<TempleEntity> temp=reps.getAll();
		System.out.println(temp);
	}

}
