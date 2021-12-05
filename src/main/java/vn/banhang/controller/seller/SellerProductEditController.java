package vn.banhang.controller.seller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vn.banhang.Model.Category;
import vn.banhang.Model.Product;
import vn.banhang.Model.SubCategory;
import vn.banhang.Model.User;
import vn.banhang.service.CategoryService;
import vn.banhang.service.ProductService;
import vn.banhang.service.SubCategoryService;
import vn.banhang.service.impl.CategoryServiceImpl;
import vn.banhang.service.impl.ProductServiceImpl;
import vn.banhang.service.impl.SubCategoryServiceImpl;
import vn.banhang.utils.Utils;

@WebServlet(urlPatterns = {"/seller/edit-product"})
public class SellerProductEditController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		if(Utils.kiemTraIsSeller(req, resp)) {
			resp.setContentType("text/html");
			resp.setCharacterEncoding("UTF-8");
			req.setCharacterEncoding("UTF-8");
			
			ProductService productService = new ProductServiceImpl();
			CategoryService categoryService = new CategoryServiceImpl();
			
			Product product = productService.get(id);
			req.setAttribute("product", product);
			
			List<Category> listCategory = categoryService.getCategories();
			req.setAttribute("listCategory", listCategory);
			
			req.getRequestDispatcher("/views/seller/product_edit.jsp").forward(req, resp);;

		}
		else {
			resp.sendRedirect(req.getContextPath() + "/login?next=seller/edit-product?id" + Integer.toString(id));
		}
	}
}
