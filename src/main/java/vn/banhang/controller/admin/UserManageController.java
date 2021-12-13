package vn.banhang.controller.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.banhang.Model.User;
import vn.banhang.service.UserService;
import vn.banhang.service.impl.UserServiceImpl;

@WebServlet(urlPatterns = {"/admin/user/manage","/admin/user"})
public class UserManageController extends HttpServlet{
	UserService userService = new UserServiceImpl();
	/**
	 * 
	 */
	private static final long serialVersionUID = -1360444481241536526L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<User> userList = userService.getAllUsers();
		req.setAttribute("userList", userList);
		RequestDispatcher rq = req.getRequestDispatcher("/views/admin/user/manage_user.jsp");
		rq.forward(req, resp);
	}
	/*@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}*/
}
