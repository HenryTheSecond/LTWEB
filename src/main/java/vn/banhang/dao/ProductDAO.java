package vn.banhang.dao;

import java.util.List;

import vn.banhang.Model.Product;
import vn.banhang.Model.Shop;

public interface ProductDAO {
	public List<Product> getAllShopProduct(Shop shop);

}
