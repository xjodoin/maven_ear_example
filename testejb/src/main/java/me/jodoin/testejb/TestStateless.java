package me.jodoin.testejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class TestStateless {

	@PersistenceContext
	private EntityManager manager;

	public TestEntity findById(Long id) {
		return manager.find(TestEntity.class, id);
	}

}
