package com.xworkz.person;

import java.util.List;

import com.xworkz.person.entity.PersonEntity;
import com.xworkz.person.repository.PersonRepository;
import com.xworkz.person.repository.PersonRepositoryImpl;

public class SonyTester {

	public static void main(String[] args) {
		PersonRepository reps=new PersonRepositoryImpl();
		
		/*
		 * Object obj=reps.findByName("Avinash"); System.out.println(obj);
		 */
		
		//List<PersonEntity> obj=reps.getAll();
		//System.out.println(obj);
		
		reps.deleteById(7);
		
		
	}

}
