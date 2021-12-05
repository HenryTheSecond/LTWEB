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
	

	@Override
	public List<Product> searchProductShop(Shop shop, String kw, int subCateId, String status) {
		try(Session session = HibernateUtil.getSessionFactory().openSession()){	
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Product> q = builder.createQuery(Product.class);
			Root<Product> root = q.from(Product.class);
			q.select(root);
			
			Predicate p = builder.like(root.get("name").as(String.class), "%%");
			
			Predicate p1 = builder.equal(root.get("shop").as(Shop.class), shop);
			Predicate p2 = builder.like(root.get("name").as(String.class), "%" + kw + "%");
			Predicate p3 = builder.equal(root.get("subCategory").get("id").as(Integer.class), subCateId);
			
			Predicate p4 = p;
			
			if(status.equals("dangban")) {
				p4 = builder.equal(root.get("status").as(Integer.class), 1);
			}
			else if(status.equals("ngungban")) {
				p4 = builder.equal(root.get("status").as(Integer.class), 0);
			}
			else if(status.equals("taman")) {
				p4 = builder.equal(root.get("status").as(Integer.class), -1);
			}
			else if(status.equals("hethang")) {
				p4 = builder.equal(root.get("amount").as(Integer.class), 0);
			}

			
			
			
			
			q.where(builder.and(p1, p2, p3, p4));
			List<Product> list = session.createQuery(q).getResultList();
			return list;
		}
	}
	
	public List<Product> searchProductShop(Shop shop, String kw, String status) {
		try(Session session = HibernateUtil.getSessionFactory().openSession()){	
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Product> q = builder.createQuery(Product.class);
			Root<Product> root = q.from(Product.class);
			q.select(root);
			
			Predicate p = builder.like(root.get("name").as(String.class), "%%");
			
			Predicate p1 = builder.equal(root.get("shop").as(Shop.class), shop);
			Predicate p2 = builder.like(root.get("name").as(String.class), "%" + kw + "%");
			
			Predicate p4 = p;
			
			if(status.equals("dangban")) {
				p4 = builder.equal(root.get("status").as(Integer.class), 1);
			}
			else if(status.equals("ngungban")) {
				p4 = builder.equal(root.get("status").as(Integer.class), 0);
			}
			else if(status.equals("taman")) {
				p4 = builder.equal(root.get("status").as(Integer.class), -1);
			}
			else if(status.equals("hethang")) {
				p4 = builder.equal(root.get("amount").as(Integer.class), 0);
			}
			
			q.where(builder.and(p1, p2, p4));
			List<Product> list = session.createQuery(q).getResultList();
			return list;
		}
	}
	
	@Override
	public Product get(int id) {
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			Product product = session.get(Product.class, id);
			return product;
		}
	}
	
	public static void main(String[] args) {
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			User u = session.get(User.class,1);
			ProductDAOImpl dao = new ProductDAOImpl();
			
			System.out.println(dao.searchProductShop(u.getShop(), "miku", 15, "tatca"));

		}
	}

}
