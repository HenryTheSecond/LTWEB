package vn.banhang.service;

import java.util.List;

import vn.banhang.Model.Product;
import vn.banhang.Model.Shop;

public interface ProductService {
	public List<Product> getAllShopProduct(Shop shop);
}
