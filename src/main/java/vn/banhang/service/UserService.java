package vn.banhang.service;

import java.util.List;

import vn.banhang.Model.User;

public interface UserService {
	public User get(String username, String password);
	public User getByID(int id);
	public List<User> getAllUsers();
	public void insert(User user);
	public void edit(User user);
	public void delete(String username);
}
