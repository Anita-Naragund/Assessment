package com.xworkz.vendor.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.xworkz.person.entity.PersonEntity;
import com.xworkz.util.SfUtil;
import com.xworkz.vendor.entity.VendorEntity;

public class VendorRepositoryImpl implements VendorRepository{
	
	private EntityManagerFactory factory = SfUtil.getFactory();

	@Override
	public void save(VendorEntity entity) {
		System.out.println("invoked save");
		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		session.persist(entity);
		session.getTransaction().commit();
		session.close();
		
	}

	@Override
	public Object findByName(String name) {
		System.out.println("invoked findByName");
		EntityManager manager=null;
		try {
			manager=factory.createEntityManager();
			manager.getTransaction().begin();
			Query query=manager.createNamedQuery("findByNameOfVendor");
			query.setParameter("name", name);
			Object entity=query.getSingleResult();
			return entity;
		}finally {
			manager.close();
		}
	}

	@Override
	public void deleteById(int id) {
		System.out.println("invoked deleteById");
		EntityManager manager=null;
		try {
			manager=factory.createEntityManager();
			manager.getTransaction().begin();
			Query query=manager.createNamedQuery("deleteByIdfromVendor");
			query.setParameter("id", id);
			query.executeUpdate();
			manager.getTransaction().commit();
		}finally {
			manager.close();
		}
	}

	@Override
	public List<VendorEntity> getAll() {
		System.out.println("invoked getAll");
		EntityManager manager=null;
		try {
			manager=factory.createEntityManager();
			manager.getTransaction().begin();
			Query query=manager.createNamedQuery("getAllDetailsOfVendor");
			List<VendorEntity> entity=query.getResultList();
			return entity;
		}finally {
			manager.close();
		}
	}

}
