

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s3")
public class Servlet3 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String skill1 = req.getParameter("skill1");
		String skill2 = req.getParameter("skill2");		
		String qualification = req.getParameter("quali");
		String university = req.getParameter("uni");
		
		
		PrintWriter out = resp.getWriter();
		out.println("<h2>DETAILS SUMMARY </h2>");
		out.println("First Name : "+fname);
		out.println("<br>Last Name : "+lname);
		out.println("<br>Skill-1 : "+skill1);
		out.println("<br>Skill-2 : "+skill2);
		out.println("<br>Qualification : "+qualification);
		out.println("<br>University : "+university);
		out.close();
		
	}
}
