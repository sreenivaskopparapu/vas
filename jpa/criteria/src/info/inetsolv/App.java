package info.inetsolv;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

public class App {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("xyz");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Object> criteriaQuery = criteriaBuilder.createQuery();
		criteriaQuery.from(Employee.class);
		TypedQuery<Object> query = entityManager.createQuery(criteriaQuery);
		List<Object> empList = query.getResultList();
		for (Object object : empList) {
			Employee employee=(Employee)object;
			System.out.println(employee);
		}
		
	}

}
