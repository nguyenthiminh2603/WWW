package vn.edu.iuh.QLTT.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.edu.iuh.QLTT.dao.DanhMucDao;
import vn.edu.iuh.QLTT.dao.TinTucDao;
import vn.edu.iuh.QLTT.entities.DanhMuc;
import vn.edu.iuh.QLTT.entities.TinTuc;

/**
 * Servlet implementation class DanhSachTinTucServlet
 */
@WebServlet("/DanhSachTinTuc")
public class DanhSachTinTucServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DanhSachTinTucServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		/*
		 * DanhMucDao danhMucDao=new DanhMucDao(); List<DanhMuc>
		 * dsdm=danhMucDao.getall(); request.setAttribute("dsdm", dsdm);
		 */
		TinTucDao tinTucDao=new TinTucDao();
		List<TinTuc> dstt=tinTucDao.getall();
		request.setAttribute("dstt", dstt);
		 RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/views/DanhSachTinTuc.jsp");
		 rd.forward(request, response);
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
