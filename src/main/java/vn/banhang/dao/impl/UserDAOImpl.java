package vn.banhang.dao.impl;

import org.hibernate.Session;
import org.hibernate.query.Query;

import vn.banhang.Hibernate.HibernateUtil;
import vn.banhang.Model.User;
import vn.banhang.dao.UserDAO;

public class UserDAOImpl implements UserDAO {

	@Override
	public User get(String username, String password) {
		try(Session session = HibernateUtil.getSessionFactory().openSession()){	
			Query q = session.createQuery("FROM User u where u.username=:username and u.password=:password");
			q.setParameter("username", username);
			q.setParameter("password", password);
			if(q.list().isEmpty())
				return null;
			return (User)q.list().get(0);
		}
	}
	
	public static void main(String[] args) {
		UserDAOImpl dao = new UserDAOImpl();
		System.out.println(dao.get("tuyen", "123"));
	}
}
