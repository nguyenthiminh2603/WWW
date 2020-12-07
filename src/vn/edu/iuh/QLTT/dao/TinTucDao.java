package vn.edu.iuh.QLTT.dao;

import java.util.List;

import org.bson.types.ObjectId;

import vn.edu.iuh.QLTT.entities.TinTuc;

public class TinTucDao extends TinTucPersistence<TinTuc>{
	public List<TinTuc> getall(){
		return em.createQuery("from TinTuc").getResultList();
	}
	public TinTuc findbyid(ObjectId id) {
		return em.find(TinTuc.class,id);
	}
}

