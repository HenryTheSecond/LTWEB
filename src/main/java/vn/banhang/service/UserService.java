package vn.banhang.service;

import vn.banhang.Model.User;

public interface UserService {
	public User get(String username, String password);
}
