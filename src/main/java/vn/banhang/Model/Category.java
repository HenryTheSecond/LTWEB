package vn.banhang.Model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.Session;

import vn.banhang.Hibernate.HibernateUtil;

@Entity
@Table(name = "category")
public class Category implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int id;
	private String name;
	
	@OneToMany(mappedBy = "category")
	private Set<SubCategory> subCategories; 
	
	@OneToMany(mappedBy = "category")
	private Set<Product> products;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<SubCategory> getSubCategories() {
		return subCategories;
	}
	public void setSubCategories(Set<SubCategory> subCategories) {
		this.subCategories = subCategories;
	}
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
	public static void main(String[] args) {
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			session.getTransaction().begin();
			
			Category c = session.get(Category.class, 1);
			System.out.println(c.subCategories.size());
			session.getTransaction().commit();
		}
	}
	
}
