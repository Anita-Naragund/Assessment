package com.xworkz.temple;

import com.xworkz.temple.entity.TempleEntity;
import com.xworkz.temple.repository.TempleRepository;
import com.xworkz.temple.repository.TempleRepositoryImpl;

public class TempleTester {
	
	public static void main(String[] args) {
		
		TempleEntity entity=new TempleEntity( "Aanjaneya", "Rajajinagar", 2000, 20);
		TempleEntity entity2=new TempleEntity( "Basavanna", "Harti", 3000, 3);
		TempleEntity entity3=new TempleEntity( "Lakshmi", "kurtakoti", 300, 2);
		TempleEntity entity4=new TempleEntity( "Ragavendra", "Rajajinagar", 500, 6);
		TempleEntity entity5=new TempleEntity( "Venkateshwara", "Tirupathi", 10000, 20);
		TempleEntity entity6=new TempleEntity( "abc", "Rajajinagar", 30, 20);
		
		
		TempleRepository reps=new TempleRepositoryImpl();
		reps.save(entity2);
		reps.save(entity3);
		reps.save(entity4);
		reps.save(entity5);
		reps.save(entity6);
	}

}
