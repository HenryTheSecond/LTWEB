package vn.banhang.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import vn.banhang.Hibernate.HibernateUtil;
import vn.banhang.Model.Cart;
import vn.banhang.Model.Product;
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

	@Override
	public List<Object[]> top5Selling(Shop shop) {
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Object[]> q = builder.createQuery(Object[].class);
			
			Root<Cart> cartRoot = q.from(Cart.class);
			Root<Product> productRoot = q.from(Product.class);
			
			List<Predicate> predicates = new ArrayList<Predicate>();
			predicates.add(builder.equal(productRoot.get("shop").as(Shop.class), shop));
			predicates.add(builder.equal(productRoot.get("id"), cartRoot.get("product")));
			predicates.add(builder.equal(cartRoot.get("status").as(String.class), "deliveried"));
				
			q.where(predicates.toArray(new Predicate[] {}));
			
			q.multiselect( productRoot.get("id"), 
							productRoot.get("name"),
							builder.count(cartRoot.get("id")),
							builder.sum(cartRoot.get("amount")),
							builder.sum(builder.prod(cartRoot.get("amount").as(Integer.class), cartRoot.get("price").as(Double.class))));
			q.groupBy(productRoot.get("id"), productRoot.get("name"));
			q.orderBy(builder.desc(builder.sum(cartRoot.get("amount"))));
			
			return session.createQuery(q).setMaxResults(5).getResultList();
		}
	}
	
	public static void main(String[] args) {
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			Shop shop = session.get(Shop.class, 1);
			List<Object[]> list = new ShopDAOImpl().top5Selling(shop);
			for(Object[] i:list) {
				System.out.println(i[0]);
				System.out.println(i[1]);
				System.out.println(i[2]);
				System.out.println(i[3]);
			}
		}
	}
	
}
