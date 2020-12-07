package vn.edu.iuh.QLTT.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

import org.bson.types.ObjectId;

/**
 * Entity implementation class for Entity: TinTuc
 *
 */
@Entity
public class TinTuc implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private ObjectId ma;
	private String tieuDe;
	private String noiDung;
	private String lienKet;
	@ManyToOne
	@JoinColumn(name = "ma")
	private DanhMuc danhmuc;
	
	private static final long serialVersionUID = 1L;

	public TinTuc() {
		super();
	}   
	   
	public ObjectId getMa() {
		return ma;
	}

	public void setMa(ObjectId ma) {
		this.ma = ma;
	}

	public String getTieuDe() {
		return this.tieuDe;
	}

	public void setTieuDe(String tieuDe) {
		this.tieuDe = tieuDe;
	}   
	public String getNoiDung() {
		return this.noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}   
	public String getLienKet() {
		return this.lienKet;
	}

	public void setLienKet(String lienKet) {
		this.lienKet = lienKet;
	}
	 
	public DanhMuc getDanhmuc() {
		return danhmuc;
	}
	public void setDanhmuc(DanhMuc danhmuc) {
		this.danhmuc = danhmuc;
	}
	public TinTuc(String tieuDe, String noiDung, String lienKet) {
		super();
		this.tieuDe = tieuDe;
		this.noiDung = noiDung;
		this.lienKet = lienKet;
	}

	public TinTuc(String tieuDe, String noiDung, String lienKet, DanhMuc danhmuc) {
		super();
		this.tieuDe = tieuDe;
		this.noiDung = noiDung;
		this.lienKet = lienKet;
		this.danhmuc = danhmuc;
	}
	
   
}
