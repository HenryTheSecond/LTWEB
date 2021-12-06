package vn.banhang.controller.seller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vn.banhang.Model.User;

@WebServlet(urlPatterns = {"/seller/home","/seller", "/seller/"})
public class SellerHomeController extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5103550605491265959L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(kiemTraUser(req, resp) == false) {
			resp.sendRedirect(req.getContextPath() +  "/login?next=seller/home");
			return;
		}
		RequestDispatcher rq = req.getRequestDispatcher("/views/seller/seller_dashboard.jsp");
		rq.forward(req, resp);
	}
	
	public boolean kiemTraUser(HttpServletRequest req, HttpServletResponse resp) {
		HttpSession session = req.getSession();
		User user = (User)session.getAttribute("user");
		if(user == null || user.getIs_seller()==0) {
			return false;
		}
		return true;
	}
}
