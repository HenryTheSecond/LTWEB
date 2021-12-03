package vn.banhang.dao;

import vn.banhang.Model.User;

public interface UserDAO {
	public User get(String username, String password);
}
