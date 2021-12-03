package vn.banhang.dao.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.query.Query;

import vn.banhang.Hibernate.HibernateUtil;
import vn.banhang.Model.Product;
import vn.banhang.Model.Shop;
import vn.banhang.Model.User;
import vn.banhang.dao.ProductDAO;

public class ProductDAOImpl implements ProductDAO {

	@Override
	public List<Product> getAllShopProduct(Shop shop) {
		try(Session session = HibernateUtil.getSessionFactory().openSession()){	
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Product> q = builder.createQuery(Product.class);
			Root<Product> root = q.from(Product.class);
			q.select(root);
			Predicate p = builder.equal(root.get("shop").as(Shop.class), shop);
			q.where(p);
			List<Product> list = session.createQuery(q).getResultList();
			return list;
		}
	}
	
	public static void main(String[] args) {
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			
			User u = session.get(User.class,1);
			System.out.println(u);
			ProductDAOImpl dao = new ProductDAOImpl();
			System.out.println(dao.getAllShopProduct(u.get));
		}
	}
}
