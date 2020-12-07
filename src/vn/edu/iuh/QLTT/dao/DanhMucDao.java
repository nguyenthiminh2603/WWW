package vn.edu.iuh.QLTT.dao;

import java.util.List;

import vn.edu.iuh.QLTT.entities.DanhMuc;

public class DanhMucDao extends TinTucPersistence<DanhMuc>{
	public List<DanhMuc> getall(){
		return em.createQuery("from DanhMuc").getResultList();
	}
}
