package vn.banhang.service;

import java.util.List;

import vn.banhang.Model.Product;

public interface ProductService {
	public List<Product> getAllShopProduct(int shopId);
}
