

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s3")
public class Servlet3 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		Cookie[] cookies = req.getCookies();
		String fname = cookies[0].getValue();
		String lname = cookies[1].getValue();
		String skill1 = cookies[2].getValue();
		String skill2 = cookies[3].getValue();
		
		
		String qualification = req.getParameter("quali");
		String university = req.getParameter("uni");
		
		
		PrintWriter out = resp.getWriter();
		out.println("<h2>DATA SUMMARY </h2>");
		out.println("First Name : "+fname);
		out.println("<br>Last Name : "+lname);
		out.println("<br>Skill-1 : "+skill1);
		out.println("<br>Skill-2 : "+skill2);
		out.println("<br>Qualification : "+qualification);
		out.println("<br>University : "+university);
		out.close();
		
	}
}
