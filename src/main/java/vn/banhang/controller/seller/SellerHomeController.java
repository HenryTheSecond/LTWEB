package vn.banhang.controller.seller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/seller/home"})
public class SellerHomeController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8742583617092661707L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rq = req.getRequestDispatcher("/views/seller/seller_dashboard.jsp");
		rq.forward(req, resp);
	}
}
