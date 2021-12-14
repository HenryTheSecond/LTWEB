package vn.banhang.dao;

import java.util.Calendar;
import java.util.List;

import javafx.util.Pair;
import vn.banhang.Model.Product;
import vn.banhang.Model.Shop;

public interface ProductDAO {
	public Pair< Integer, List<Product> > getAllShopProduct(Shop shop, int page);
	public Pair< Integer, List<Product>> searchProductShop(Shop shop, String kw, int subCateId, String status, int page);
	public Pair< Integer, List<Product>> searchProductShop(Shop shop, String kw, String status, int page);
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

	public List<Product> getProductBySubCate(int subCateId);
	public List<Product> getProductByCate(int CateId);
	public List<Product> getThreeProduct();

}
