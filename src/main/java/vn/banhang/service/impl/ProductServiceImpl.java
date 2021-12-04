package vn.banhang.service.impl;

import java.util.List;

import vn.banhang.Model.Product;
import vn.banhang.Model.Shop;
import vn.banhang.dao.ProductDAO;
import vn.banhang.dao.impl.ProductDAOImpl;
import vn.banhang.service.ProductService;

public class ProductServiceImpl implements ProductService {
	private ProductDAO dao = new ProductDAOImpl();
	
	@Override
	public List<Product> getAllShopProduct(Shop shop) {
		return dao.getAllShopProduct(shop);
	}

}
