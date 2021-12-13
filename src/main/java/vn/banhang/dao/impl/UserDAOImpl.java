package vn.banhang.dao.impl;

import java.util.Calendar;
import java.util.List;

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
	@Override
	public List<User> getAllUsers() {
		try(Session session = HibernateUtil.getSessionFactory().openSession();) {
			Query<User> query = session.createQuery("FROM User");
			List<User> users = query.list();
			session.close();
			return users;
		}
	}
	
	@Override
	public void insert(User user) {
		try(Session session = HibernateUtil.getSessionFactory().openSession();) {
			session.getTransaction().begin();
			session.save(user);
			session.getTransaction().commit();
		}
		
	}
	@Override
	public void edit(User user) {
		try(Session session = HibernateUtil.getSessionFactory().openSession();) {
			session.getTransaction().begin();
			
			String hql = "UPDATE User " +
						"SET password =: ps, is_seller =: is, is_admin =: ia, name =: name, gender =: gd, birthdate =: bd, phone =: phone, email =: email " +
						"WHERE username =: us";
			Query q = session.createQuery(hql);
			
			q.setParameter("ps", user.getPassword());
			q.setParameter("is", user.getIs_seller());
			q.setParameter("ia", user.getIs_admin());
			q.setParameter("name", user.getName());
			q.setParameter("gd", user.getGender());
			q.setParameter("bd", user.getBirthdate());
			q.setParameter("phone", user.getPhone());
			q.setParameter("email", user.getEmail());
			q.setParameter("us", user.getUsername());
			q.executeUpdate();
			
			
			session.getTransaction().commit();
		}
	}
	@Override
	public void delete(String username) {
		try(Session session = HibernateUtil.getSessionFactory().openSession();) {
			session.getTransaction().begin();
			
			String hql = "delete from User where username =:us ";
			Query q = session.createQuery(hql);
			q.setParameter("us", username);
			q.executeUpdate();
			
			session.getTransaction().commit();
		}
	}
	@Override
	public User getByID(int id) {
		try(Session session = HibernateUtil.getSessionFactory().openSession()){	
			User user = session.get(User.class, id);
			return user;
		}
	}
	
	
	public static void main(String[] args) {
		UserDAOImpl dao = new UserDAOImpl();
		/*System.out.println(dao.get("tuyen", "123"));*/
		
		/*List<User> uTest = dao.getAllUsers();
		uTest.forEach(u -> System.out.println(u.getName()));*/
		
		Calendar birthdate = Calendar.getInstance();
		User u1 = new User();
		u1.setUsername("thang1");
		u1.setPassword("123");
		u1.setEmail("@@");
		u1.setName("thang1");
		u1.setBirthdate(birthdate);
		u1.setGender("male");
		u1.setPhone("098765");
		u1.setIs_admin(1);
		u1.setIs_seller(1);
		
		User u2 = new User();
		u2.setUsername("thang2");
		u2.setPassword("123");
		u2.setEmail("@@");
		u2.setName("thang2");
		u2.setBirthdate(birthdate);
		u2.setGender("male");
		u2.setPhone("098765");
		u2.setIs_admin(1);
		u2.setIs_seller(1);
		
		User u3 = new User();
		u3.setUsername("thang3");
		u3.setPassword("123");
		u3.setEmail("@@");
		u3.setName("thang3");
		u3.setBirthdate(birthdate);
		u3.setGender("male");
		u3.setPhone("098765");
		u3.setIs_admin(1);
		u3.setIs_seller(1);
		
		dao.insert(u1);
		dao.insert(u2);
		dao.insert(u3);
		
		List<User> uTest = dao.getAllUsers();
		uTest.forEach(u -> System.out.println(u.getName()));
	}
	
	
}
