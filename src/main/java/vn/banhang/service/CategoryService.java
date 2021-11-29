package vn.banhang.service;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import vn.banhang.Hibernate.HibernateUtil;
import vn.banhang.Model.Category;

public class CategoryService {
	private final static SessionFactory factory = HibernateUtil.getSessionFactory();
	
	public List<Category> getCategories(){
		try(Session session = factory.openSession()){
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Category> query = builder.createQuery(Category.class);
			Root<Category> root = query.from(Category.class);
			query.select(root);
			
			return session.createQuery(query).getResultList();
		}
	}
}
