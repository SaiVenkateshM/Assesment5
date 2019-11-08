package com.assesment5.dao;

import javax.persistence.EntityManager;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


import com.assesment5.modal.Product;
import com.assesment5.util.HibernateUtil;

public class ProductDao {
	Transaction trns = null;
public void addProduct(Product product){
	EntityManager em =  HibernateUtil.getEntityManagerFactory().createEntityManager();

	em.getTransaction().begin();
	em.persist(product);
	em.getTransaction().commit();
}
public void updateProduct(Product product) {
	EntityManager em =  HibernateUtil.getEntityManagerFactory().createEntityManager();
	em.getTransaction().begin();
	em.merge(product);
	em.getTransaction().commit();

}
public void deleteProduct(Product product) {
	EntityManager em =  HibernateUtil.getEntityManagerFactory().createEntityManager();
	em.getTransaction().begin();
	em.remove(em.contains(product) ? product : em.merge(product));
}
}
