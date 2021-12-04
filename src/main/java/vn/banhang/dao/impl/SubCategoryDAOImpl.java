package vn.banhang.dao.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import vn.banhang.Hibernate.HibernateUtil;
import vn.banhang.Model.Product;
import vn.banhang.Model.Shop;
import vn.banhang.Model.SubCategory;
import vn.banhang.dao.SubCategoryDAO;

public class SubCategoryDAOImpl implements SubCategoryDAO{

	@Override
	public List<SubCategory> getAllSubCategory() {
		try(Session session = HibernateUtil.getSessionFactory().openSession()){	
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<SubCategory> q = builder.createQuery(SubCategory.class);
			Root<SubCategory> root = q.from(SubCategory.class);
			q.select(root);
			List<SubCategory> list = session.createQuery(q).getResultList();
			return list;
		}
	}
	
}
