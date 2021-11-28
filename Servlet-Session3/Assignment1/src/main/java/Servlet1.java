

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s1")
public class Servlet1 extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		PrintWriter out = resp.getWriter();
		out.println("<h2>Skill Details</h2>");
		out.println("<form action='s2' method='post'>");
		out.println("Skill-1 : <input type='text' name='skill1'><br>");
		out.println("Skill-2 : <input type='text' name='skill2'><br>");
		
		//hidden form details
		out.println("<input type='hidden' name='fname' value='"+fname+"'>");
		out.println("<input type='hidden' name='lname' value='"+lname+"'>");
		
		out.println("<input type='submit' value='Next'>");
		out.println("</form>");
		out.close();
	}
}
