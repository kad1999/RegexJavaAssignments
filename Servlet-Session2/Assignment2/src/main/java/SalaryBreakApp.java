import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/salary-breakup")
public class SalaryBreakApp extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String name = req.getParameter("name");
		String eid= req.getParameter("id");
		String mobile = req.getParameter("mobile");
		String email = req.getParameter("email");
		int salary = Integer.parseInt(req.getParameter("salary"));
		
		double pf = 0.1*salary;
		double esi = 0.2*salary;
		double hra = (0.2*salary);
		double da= (0.1*salary);
		double gross = salary+hra+pf+esi+da;
		double net = gross-(pf+esi);
		PrintWriter out = resp.getWriter();
		out.println("Salary break-Up");
		out.println("<table border='1' style='background-color:yellow'>");
		out.println("<tr><th>EID :</th><td>"+eid+"</td></tr>");
		out.println("<tr><th>Name : </th><td>"+name+"</td></tr>");
		out.println("<tr><th>Mobile : </th><td>"+mobile+"</td></tr>");
		out.println("<tr><th>Email : </th><td>"+email+"</td></tr>");
		out.println("<tr><th>Salary :</th><td> "+salary+"</td></tr>");
		out.println("<tr><th>PF : </th><td>"+pf+"</td></tr>");
		out.println("<tr><th>ESI :</th><td> "+esi+"</td></tr>");
		out.println("<tr><th>HRA :</th><td> "+hra+"</td></tr>");
		out.println("<tr><th>DA :</th><td> "+da+"</td></tr>");
		out.println("<tr><th>Gross : </th><td>"+gross+"</td></tr>");
		out.println("<tr><th>Net : </th><td>"+net+"</td></tr>");
		out.println("</table>");
		out.close();
	}
}
