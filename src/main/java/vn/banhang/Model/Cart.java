package vn.banhang.Model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cart")
public class Cart implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String phone;
	private String location;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
	
	private double price;
	private int amount;
	private Calendar order_date;
	private Calendar delivery_date;
	private String status;
	
	
}
