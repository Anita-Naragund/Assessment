package com.xworkz.person.repository;

import java.util.List;

import com.xworkz.person.entity.PersonEntity;

public interface PersonRepository {

	void save(PersonEntity entity);

	Object findByName(String name);

	void deleteById(int id);

	List<PersonEntity> getAll();
}
