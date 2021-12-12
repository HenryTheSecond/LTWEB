package vn.banhang.dao;

import java.util.Calendar;
import java.util.List;

import vn.banhang.Model.Cart;
import vn.banhang.Model.Shop;

public interface CartDAO {
	 public List<Cart> getAllShopOrder(Shop shop);
	 public List<Cart> shopSearch(Shop shop, String status, String kw, Calendar from, Calendar to);
	 public void deliveryCart(int id);
}
