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
import vn.banhang.Model.User;
import vn.banhang.service.ProductService;
import vn.banhang.service.impl.ProductServiceImpl;
import vn.banhang.utils.Utils;

@WebServlet(urlPatterns = {"/seller/product"})
public class SellerProductController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(Utils.kiemTraIsSeller(req, resp)) {
			resp.setContentType("text/html");
			resp.setCharacterEncoding("UTF-8");
			req.setCharacterEncoding("UTF-8");
			
			HttpSession session = req.getSession();
			User user = (User)session.getAttribute("user");
			
			ProductService service = new ProductServiceImpl();
			List<Product> listProduct = service.getAllShopProduct(user.getShop());
			
			req.setAttribute("listProduct", listProduct);
			
			
			req.getRequestDispatcher("/views/seller/products.jsp").forward(req, resp);
		}
		else {
			resp.sendRedirect(req.getContextPath() + "/login?next=seller/product");
		}
	}
}
