package org.tnsindia.jionedinheritance;

import java.io.Closeable;

import javax.net.ssl.KeyManagerFactory;
import javax.persistence.EntityManager;

//driver class

public class JoinedInheritanceDemo {

	public static void main(String[] args) {
		Object Persistence;
		KeyManagerFactory f=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=f.createEntityManager();
		em.getTransaction().begin();
		
		//create a sales
		Sales s=new Sales();
		s.setSales_id(14);
		s.setPrice(4000.50);
		em.persist(s);
		
		Sales s1=new Sales();
		s1.setSales_id(19);
		s1.setPrice(3400.30);
		em.persist(s1);
		
		//create a dept
		
		SalesDepartment d=new SalesDepartment();
		d.setSales_id(31);
		d.setPrice(7700.30);
		d.setDept_id(123);
		d.setDept_name("Cosmetics");
		em.persist(d);
		
		em.getTransaction().commit();
		System.out.println("The data is Successfully added");
		em.close();
		((Closeable) f).close();
		
	}

}