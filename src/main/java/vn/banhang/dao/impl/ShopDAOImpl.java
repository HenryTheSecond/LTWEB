package vn.banhang.dao.impl;

import org.hibernate.Session;

import vn.banhang.Hibernate.HibernateUtil;
import vn.banhang.Model.Shop;
import vn.banhang.dao.ShopDAO;

public class ShopDAOImpl implements ShopDAO {

	@Override
	public void update(Shop shop) {
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			session.getTransaction().begin();
			session.merge(shop);
			session.getTransaction().commit();
		}
	}
	
}
