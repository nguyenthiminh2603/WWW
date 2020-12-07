package vn.edu.iuh.QLTT.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

import org.bson.types.ObjectId;

/**
 * Entity implementation class for Entity: DanhMuc
 *
 */
@Entity
public class DanhMuc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private ObjectId ma;
	private String ten;
	private String nguoiQuanLy;
	private String ghiChu;
	@OneToMany(fetch = FetchType.EAGER,mappedBy = "danhmuc")
	private List<TinTuc> dsTT;

	public DanhMuc(ObjectId id) {
		this.ma = id;
	}
	
	public DanhMuc() {
		super();
	}   
	  
	public ObjectId getMa() {
		return ma;
	}

	public void setMa(ObjectId ma) {
		this.ma = ma;
	}

	public String getTen() {
		return this.ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}   
	public String getNguoiQuanLy() {
		return this.nguoiQuanLy;
	}

	public void setNguoiQuanLy(String nguoiQuanLy) {
		this.nguoiQuanLy = nguoiQuanLy;
	}   
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
	public List<TinTuc> getDsTT() {
		return dsTT;
	}
	public void setDsTT(List<TinTuc> dsTT) {
		this.dsTT = dsTT;
	}
	public DanhMuc(String ten, String nguoiQuanLy, String ghiChu) {
		super();
		this.ten = ten;
		this.nguoiQuanLy = nguoiQuanLy;
		this.ghiChu = ghiChu;
	}
   
}
