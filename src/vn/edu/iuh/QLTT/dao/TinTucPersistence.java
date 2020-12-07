package vn.edu.iuh.QLTT.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TinTucPersistence<T> {
	protected EntityManager em;
	public TinTucPersistence() {
		// TODO Auto-generated constructor stub
		em=Persistence.createEntityManagerFactory("Bai7").createEntityManager();
	}
	public boolean addT(T t) {
		EntityTransaction tr=em.getTransaction();
		try {
			tr.begin();
			em.persist(t);
			tr.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
			// TODO: handle exception
		}
		return false;
	}
}
