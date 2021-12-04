package vn.banhang.controller.seller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vn.banhang.Model.Product;
import vn.banhang.Model.SubCategory;
import vn.banhang.Model.User;
import vn.banhang.service.ProductService;
import vn.banhang.service.SubCategoryService;
import vn.banhang.service.impl.ProductServiceImpl;
import vn.banhang.service.impl.SubCategoryServiceImpl;
import vn.banhang.utils.Utils;

@WebServlet(urlPatterns = {"/seller/product"})
public class SellerProductController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(Utils.kiemTraIsSeller(req, resp)) {
			resp.setContentType("text/html");
			resp.setCharacterEncoding("UTF-8");
			req.setCharacterEncoding("UTF-8");
			
			String kw = req.getParameter("kw");
			String subCate = req.getParameter("subCate");
			String status = req.getParameter("status");
			
			System.out.println(kw);System.out.println(subCate);System.out.println(status);
			
			HttpSession session = req.getSession();
			User user = (User)session.getAttribute("user");
			
			ProductService service = new ProductServiceImpl();
			SubCategoryService subCateService = new SubCategoryServiceImpl();
			List<Product> listProduct;
			if(kw == null && subCate == null && status == null) {
				listProduct = service.getAllShopProduct(user.getShop());
				req.setAttribute("listProduct", listProduct);
			}
			else {
				if(subCate.equals("")) {
					listProduct = service.searchProductShop(user.getShop(), kw, status);
					req.setAttribute("listProduct", listProduct);
					System.out.println(listProduct);
				}
				else {
					int subCateId = Integer.parseInt(subCate);
					listProduct = service.searchProductShop(user.getShop(), kw, subCateId, status);
					req.setAttribute("listProduct", listProduct);
					System.out.println(listProduct);
				}
			}

			
			List<SubCategory> listSubCate = subCateService.getAllSubCategory();
			req.setAttribute("listSubCate", listSubCate);
			
			
			req.getRequestDispatcher("/views/seller/products.jsp").forward(req, resp);
		}
		else {
			resp.sendRedirect(req.getContextPath() + "/login?next=seller/product");
		}
	}
}
