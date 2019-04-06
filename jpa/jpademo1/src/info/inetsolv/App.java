package info.inetsolv;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class App {

	private static final Object Double = null;

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("abc");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpQL = "select e from Employee e where e.salary>:minSalary and e.salary<:maxSalary";
	
		TypedQuery<Employee> query = entityManager.createQuery(jpQL, Employee.class);		  		
			
			query.setParameter("minSalary", 10000);
			query.setParameter("maxSalary", 60000);
			List<Employee> list = query.getResultList();
			for (Employee employee : list) {
				
				System.out.println(employee);
			}
		entityManager.close();
		entityManagerFactory.close();
	}

}
