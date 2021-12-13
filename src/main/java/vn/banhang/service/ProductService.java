package vn.banhang.service;

import java.util.List;

import vn.banhang.Model.Product;
import vn.banhang.Model.Shop;

public interface ProductService {
	public List<Product> getAllShopProduct(Shop shop);
	public List<Product> searchProductShop(Shop shop, String kw, int subCateId, String status);
	public List<Product> searchProductShop(Shop shop, String kw, String status);
	public Product get(int id);
	public void update(Product product);
	public void add(Product product);
	public List<Product> getSixProduct();
	public List<Product> getSevenProduct();
	public List<Product> getAllProduct();
	public List<Product> getProductBySubCate(int subCateId);
	public List<Product> getProductByCate(int CateId);
	public List<Product> getThreeProduct();
}
