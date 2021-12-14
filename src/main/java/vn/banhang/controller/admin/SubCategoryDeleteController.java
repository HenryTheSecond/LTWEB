package vn.banhang.controller.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.banhang.Model.SubCategory;
import vn.banhang.service.SubCategoryService;
import vn.banhang.service.impl.SubCategoryServiceImpl;

@WebServlet(urlPatterns = {"/admin/sub_category/delete"})
public class SubCategoryDeleteController extends HttpServlet{
	SubCategoryService subCateService = new SubCategoryServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		SubCategory subCate = subCateService.get(id);
		subCateService.delete(subCate.getName());
		resp.sendRedirect(req.getContextPath() + "/admin/sub_category/manage");
	}
}