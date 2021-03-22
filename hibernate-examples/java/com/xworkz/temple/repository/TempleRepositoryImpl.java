package com.xworkz.temple.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.temple.entity.TempleEntity;
import com.xworkz.util.SfUtil;

public class TempleRepositoryImpl implements TempleRepository {

	private EntityManagerFactory factory = SfUtil.getFactory();

	@Override
	public void save(TempleEntity entity) {
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
		EntityManager session = null;
		try {
			session = factory.createEntityManager();
			session.getTransaction().begin();
			Query query = session.createNamedQuery("findByName");
			query.setParameter("name", name);
			Object entity = query.getSingleResult();
			return entity;
		} finally {
			session.close();
		}
	}

	@Override
	public void deleteById(int id) {
		System.out.println("invoked deleteById");
		EntityManager manager=null;
		try {
			manager=factory.createEntityManager();
			manager.getTransaction().begin();
			Query query=manager.createNamedQuery("deleteById");
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
			Query query = manager.createNamedQuery("getByName");
			query.setParameter("name", name);
			Object entity = query.getSingleResult();
			return entity;
		}finally {
			manager.close();
		}
	}

	@Override
	public List<TempleEntity> getAll() {
		System.out.println("invoked getAll");
		EntityManager manager=null;
		try {
			manager=factory.createEntityManager();
			manager.getTransaction().begin();
			Query query = manager.createNamedQuery("getAll");
			List<TempleEntity> entity = query.getResultList();
			return entity;
		}finally {
			manager.close();
		}
		
	}

}
