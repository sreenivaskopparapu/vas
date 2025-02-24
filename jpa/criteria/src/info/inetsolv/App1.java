package info.inetsolv;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.From;
import javax.persistence.criteria.Root;

public class App1 {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("xyz");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Object> criteriaQuery = criteriaBuilder.createQuery();
		From<Employee,Employee> root = criteriaQuery.from(Employee.class);
		criteriaQuery.where(criteriaBuilder.gt(root.get("salary"), new BigDecimal(20000)));
		TypedQuery<Object> typedQuery = entityManager.createQuery(criteriaQuery);
		List<Object> empList = typedQuery.getResultList();
		for (Object object : empList) {
			System.out.println(object);
		}
		
		
	}

}
