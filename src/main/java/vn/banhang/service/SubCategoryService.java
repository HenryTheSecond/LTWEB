package vn.banhang.service;

import java.util.List;

import vn.banhang.Model.SubCategory;

public interface SubCategoryService {
	public List<SubCategory> getAllSubCategory();
	public SubCategory get(int id);
}
