package vn.banhang.dao;

import java.util.Calendar;
import java.util.List;

import vn.banhang.Model.Product;
import vn.banhang.Model.Shop;

public interface ProductDAO {
	public List<Product> getAllShopProduct(Shop shop);
	public List<Product> searchProductShop(Shop shop, String kw, int subCateId, String status);
	public List<Product> searchProductShop(Shop shop, String kw, String status);
	public Product get(int id);
	public void update(Product product);
	public void add(Product product);
	public List<Product> getSixProduct();
	public List<Product> getSevenProduct();
	public List<Product> getAllProduct();
	public List<Object[]> statsQuantityShop(Shop shop, Calendar from, Calendar to);
	public Object[] statsDeliveriedProduct(int id);
	public long countPendingOrder(int id);
	public long countCanceledOrder(int id);
}
