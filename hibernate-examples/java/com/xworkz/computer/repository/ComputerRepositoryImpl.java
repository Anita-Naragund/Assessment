package com.xworkz.computer.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.xworkz.computer.entity.ComputerEntity;
import com.xworkz.util.SfUtil;

public class ComputerRepositoryImpl implements ComputerRepository {

	private EntityManagerFactory factory = SfUtil.getFactory();
	
	@Override
	public void save(ComputerEntity entity) {
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
			Query query=manager.createNamedQuery("findByNameOfComputer");
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
			Query query=manager.createNamedQuery("deleteByIdfromComputer");
			query.setParameter("id", id);
			query.executeUpdate();
			manager.getTransaction().commit();
		}finally {
			manager.close();
		}
		
	}

	@Override
	public Object getByName(String name) {
		System.out.println("invoked getByName");
		EntityManager manager=null;
		try {
			manager=factory.createEntityManager();
			manager.getTransaction().begin();
			Query query=manager.createNamedQuery("getByNameOfComputer");
			query.setParameter("name", name);
			Object entity = query.getSingleResult();
			return entity;
		}finally {
			manager.close();
		}
	}

	@Override
	public List<ComputerEntity> getAll() {
		System.out.println("invoked getAll");
		EntityManager manager=null;
		try {
			manager=factory.createEntityManager();
			manager.getTransaction().begin();
			Query query=manager.createNamedQuery("getAllDetails");
			List<ComputerEntity> entity=query.getResultList();
			return entity;
		}finally {
			manager.close();
		}
		
	}

}
