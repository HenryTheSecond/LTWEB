package vn.banhang.dao;

import java.util.List;

import vn.banhang.Model.Shop;

public interface ShopDAO {
	public void update(Shop shop);
	public List<Object[]> top5Selling(Shop shop);
}
