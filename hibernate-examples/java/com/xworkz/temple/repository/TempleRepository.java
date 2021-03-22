package com.xworkz.temple.repository;

import java.util.List;

import com.xworkz.temple.entity.TempleEntity;

public interface TempleRepository {
	
	void save(TempleEntity entity);
	
	Object findByName(String name);
	
    void deleteById(int id);
    
    Object getByName(String name);
    
    List<TempleEntity> getAll();
	
	

}
