package vn.banhang.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vn.banhang.Model.User;

public class Utils {
	public static boolean kiemTraIsSeller(HttpServletRequest req, HttpServletResponse resp) {
		HttpSession session = req.getSession();
		User user = (User)session.getAttribute("user");
		if(user == null || user.getIs_seller()==0) {
			return false;
		}
		return true;
	}
}