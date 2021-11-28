

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s2")
public class Servlet2 extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");

		String skill1 = req.getParameter("skill1");
		String skill2 = req.getParameter("skill2");
		
		Cookie skill1Cookie = new Cookie("skill1", skill1);
		Cookie skill2Cookie = new Cookie("skill2", skill2);
		resp.addCookie(skill1Cookie);
		resp.addCookie(skill2Cookie);
		
		PrintWriter out = resp.getWriter();
		out.println("<h2>Education Details</h2>");
		out.println("<form action='s3' method='post'>");
		out.println("Qulaification : <input type='text' name='quali'><br>");
		out.println("University : <input type='text' name='uni'><br>");
		out.println("<input type='submit' value='Submit'>");
		out.println("</form>");
		out.close();
	}
}
