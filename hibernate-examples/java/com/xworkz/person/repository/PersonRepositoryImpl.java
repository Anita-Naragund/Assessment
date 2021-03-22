package com.xworkz.person.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.xworkz.person.entity.PersonEntity;
import com.xworkz.util.SfUtil;

public class PersonRepositoryImpl implements PersonRepository {
	
	private EntityManagerFactory factory = SfUtil.getFactory();

	@Override
	public void save(PersonEntity entity) {
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
			Query query=manager.createNamedQuery("findByNameOfPerson");
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
			Query query=manager.createNamedQuery("deleteByIdfromPerson");
			query.setParameter("id", id);
			query.executeUpdate();
			manager.getTransaction().commit();
		}finally {
			manager.close();
		}
		
	}


	@Override
	public List<PersonEntity> getAll() {
		System.out.println("invoked getAll");
		EntityManager manager=null;
		try {
			manager=factory.createEntityManager();
			manager.getTransaction().begin();
			Query query=manager.createNamedQuery("getAllDetailsOfPerson");
			List<PersonEntity> entity=query.getResultList();
			return entity;
		}finally {
			manager.close();
		}
	}

}
