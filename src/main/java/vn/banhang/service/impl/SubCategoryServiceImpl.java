package vn.banhang.service.impl;

import java.util.List;

import vn.banhang.Model.SubCategory;
import vn.banhang.dao.SubCategoryDAO;
import vn.banhang.dao.impl.SubCategoryDAOImpl;
import vn.banhang.service.SubCategoryService;

public class SubCategoryServiceImpl implements SubCategoryService {
	private SubCategoryDAO dao = new SubCategoryDAOImpl();
	
	@Override
	public List<SubCategory> getAllSubCategory() {
		// TODO Auto-generated method stub
		return dao.getAllSubCategory();
	}

}