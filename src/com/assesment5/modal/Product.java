package com.assesment5.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.TableGenerator;




@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
private int id;
private String prname;
private String disc;
private int price;
private int quantity;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPrname() {
	return prname;
}
public void setPrname(String prname) {
	this.prname = prname;
}
public String getDisc() {
	return disc;
}
public void setDisc(String disc) {
	this.disc = disc;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public Product() {
	super();
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public Product(String prname, String disc, int price, int quantity) {
	super();
	this.prname = prname;
	this.disc = disc;
	this.price = price;
	this.quantity = quantity;
}

}
