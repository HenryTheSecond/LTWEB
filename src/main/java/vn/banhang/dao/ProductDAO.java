package vn.banhang.dao;

import java.util.List;

import vn.banhang.Model.Product;
import vn.banhang.Model.Shop;

public interface ProductDAO {
	public List<Product> getAllShopProduct(Shop shop);
	public List<Product> searchProductShop(Shop shop, String kw, int subCateId, String status);
	public List<Product> searchProductShop(Shop shop, String kw, String status);
	public Product get(int id);
}
