package com.xworkz.person;

import com.xworkz.person.entity.PersonEntity;
import com.xworkz.person.repository.PersonRepository;
import com.xworkz.person.repository.PersonRepositoryImpl;

public class PersonTester {

	public static void main(String[] args) {
		PersonEntity entity=new PersonEntity("Trupti", "truptit98@gmail.com", 369857412);
		PersonEntity entity2=new PersonEntity("Nikita", "nikitaskgoudar@gmail.com", 968574521);
		PersonEntity entity3=new PersonEntity("Anita", "anitavn022@gmail.com", 635241785);
		PersonEntity entity4=new PersonEntity("Avinash", "avinash1994@gmail.com", 857463521);
		PersonEntity entity5=new PersonEntity("Sunita", "sunitanaragund@gmail.com", 968541235);
		PersonEntity entity6=new PersonEntity("Vidya", "vidyanaragund02@gmail.com", 985741236);
		PersonEntity entity7=new PersonEntity("Vinnu", "vinnu2000@gmail.com", 635217489);
		
		PersonRepository reps=new PersonRepositoryImpl();
				reps.save(entity);
				reps.save(entity2);
				reps.save(entity3);
				reps.save(entity4);
				reps.save(entity5);
				reps.save(entity6);
				reps.save(entity7);
		

	}

}
