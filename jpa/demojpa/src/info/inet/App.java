package info.inet;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("demojpa");
EntityManager entityManager = entityManagerFactory.createEntityManager();
entityManager.getTransaction().begin();
Employee employee = new Employee(10,"madhan",new BigDecimal("42000"));
   entityManager.persist(employee);
entityManager.getTransaction().commit();
        entityManager.close();		
		entityManagerFactory.close();

	}

}
