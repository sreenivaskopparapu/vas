package info.inetsolv;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RetriveRecords")
public class RetriveRecords extends HttpServlet {
	private static final long serialVersionUID = 1L;
        public RetriveRecords() {
        }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("abc");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jQuery="select e from Employee e";
		Query query = entityManager.createQuery(jQuery);
		List list = query.getResultList();
		for (Object object : list) {
			out.println(object );
			
		}
		
	}
}
