package info.inetsolv;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class App {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("abc");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Query nativeQuery = entityManager.createNativeQuery("insert into emp_tbl values(11,'pavan',52000)");
		nativeQuery.executeUpdate();
		
			entityManager.getTransaction().commit();
		
		
	}

}
