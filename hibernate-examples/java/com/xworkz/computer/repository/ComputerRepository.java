package com.xworkz.computer.repository;

import java.util.List;

import com.xworkz.computer.entity.ComputerEntity;

public interface ComputerRepository {

	void save(ComputerEntity entity);

	Object findByName(String name);

	void deleteById(int id);

	Object getByName(String name);

	List<ComputerEntity> getAll();

}
