package vn.banhang.controller.seller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.banhang.utils.Utils;

@WebServlet(urlPatterns = {"/seller/product"})
public class SellerProductController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(Utils.kiemTraIsSeller(req, resp)) {
			req.getRequestDispatcher("/views/seller/products.jsp").forward(req, resp);
		}
		else {
			resp.sendRedirect(req.getContextPath() + "/login?next=seller/product");
		}
	}
}
