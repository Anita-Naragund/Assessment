package com.xworkz.machine.repository;

import java.util.List;

import com.xworkz.machine.entity.MachineEntity;

public interface MachineRepository {
	
	void save(MachineEntity entity);

	Object findByName(String name);

	void deleteById(int id);

	Object getByName(String name);

	List<MachineEntity> getAll();

}
