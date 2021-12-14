package vn.banhang.controller.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.banhang.service.CategoryService;
import vn.banhang.service.impl.CategoryServiceImpl;

@WebServlet(urlPatterns = {"/admin/category/delete"})
public class CategoryDeleteController extends HttpServlet{
	CategoryService cateService = new CategoryServiceImpl();
	/**
	 * 
	 */
	private static final long serialVersionUID = 4399621604632614040L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String cname = cateService.getByID(id).getName();
		cateService.delete(cname);
		resp.sendRedirect(req.getContextPath() + "/admin/category/manage");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
