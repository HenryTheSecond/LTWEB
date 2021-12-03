package vn.banhang.service.impl;

import vn.banhang.Model.User;
import vn.banhang.dao.UserDAO;
import vn.banhang.dao.impl.UserDAOImpl;
import vn.banhang.service.UserService;

public class UserServiceImpl implements UserService {

	UserDAO dao = new UserDAOImpl();
	@Override
	public User get(String username, String password) {
		return dao.get(username, password);
	}
}
