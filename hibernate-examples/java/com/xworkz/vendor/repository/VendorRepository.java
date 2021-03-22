package com.xworkz.vendor.repository;

import java.util.List;

import com.xworkz.vendor.entity.VendorEntity;

public interface VendorRepository {
	
	void save(VendorEntity entity);

	Object findByName(String name);

	void deleteById(int id);

	List<VendorEntity> getAll();

}
