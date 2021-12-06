package vn.banhang.service.impl;

import vn.banhang.Model.Shop;
import vn.banhang.dao.ShopDAO;
import vn.banhang.dao.impl.ShopDAOImpl;
import vn.banhang.service.ShopService;

public class ShopServiceImpl implements ShopService {
	ShopDAO dao = new ShopDAOImpl();
	
	@Override
	public void update(Shop shop) {
		dao.update(shop);
	}

}
