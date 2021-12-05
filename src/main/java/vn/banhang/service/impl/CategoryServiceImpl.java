package vn.banhang.service.impl;

import java.util.List;

import vn.banhang.Model.Category;
import vn.banhang.dao.CategoryDAO;
import vn.banhang.dao.impl.CategoryDAOImpl;
import vn.banhang.service.CategoryService;

public class CategoryServiceImpl implements CategoryService {
	CategoryDAO dao = new CategoryDAOImpl();
	@Override
	public List<Category> getCategories() {
		// TODO Auto-generated method stub
		return dao.getCategories();
	}
	
}
