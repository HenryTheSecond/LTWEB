package vn.banhang.service;

import java.util.List;

import vn.banhang.Model.Shop;

public interface ShopService {
	public void update(Shop shop);
	public List<Object[]> top5Selling(Shop shop);
}
