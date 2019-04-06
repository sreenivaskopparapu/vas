package info.inetsolv;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DisplayRecords")
public class DisplayRecords extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)  {
				try {
					
				
				PrintWriter out=response.getWriter();
				
				EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("abc");
				EntityManager entityManager = entityManagerFactory.createEntityManager();
				String jpQL="select e from Employee e";
				TypedQuery<Employee> query = entityManager.createQuery(jpQL, Employee.class);
				List<Employee> list = query.getResultList();
				for (Employee employee : list) {
					out.println(employee);
					
				}
				entityManager.clear();
				entityManagerFactory.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
	}

}
