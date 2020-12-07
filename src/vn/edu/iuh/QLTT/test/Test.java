package vn.edu.iuh.QLTT.test;

import vn.edu.iuh.QLTT.dao.DanhMucDao;
import vn.edu.iuh.QLTT.dao.TinTucDao;
import vn.edu.iuh.QLTT.entities.DanhMuc;
import vn.edu.iuh.QLTT.entities.TinTuc;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DanhMucDao danhMucDao = new DanhMucDao();
		TinTucDao tinTucDao = new TinTucDao();

		 DanhMuc danhMuc=new DanhMuc("gagaga", "gagaga", "gagaga");
		 
		 TinTuc tinTuc=new TinTuc("ssss", "aa", "s", new DanhMuc(danhMuc.getMa()));
//		  danhMucDao.addT(danhMuc);
		  tinTucDao.addT(new TinTuc("ssss", "aa", "s", danhMuc));

	}

}
