package com.xworkz.machine.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.xworkz.computer.entity.ComputerEntity;
import com.xworkz.machine.entity.MachineEntity;
import com.xworkz.util.SfUtil;

public class MachineRepositoryImpl  implements MachineRepository{
	
	private EntityManagerFactory factory = SfUtil.getFactory();

	@Override
	public void save(MachineEntity entity) {
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
			Query query=manager.createNamedQuery("findByNameOfMachine");
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
			Query query=manager.createNamedQuery("deleteByIdfromMachine");
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
			Query query=manager.createNamedQuery("getByNameOfMachine");
			query.setParameter("name", name);
			Object entity = query.getSingleResult();
			return entity;
		}finally {
			manager.close();
		}
	}

	@Override
	public List<MachineEntity> getAll() {
		System.out.println("invoked getAll");
		EntityManager manager=null;
		try {
			manager=factory.createEntityManager();
			manager.getTransaction().begin();
			Query query=manager.createNamedQuery("getAllDetailsOfMachine");
			List<MachineEntity> entity=query.getResultList();
			return entity;
		}finally {
			manager.close();
		}
	}

}
