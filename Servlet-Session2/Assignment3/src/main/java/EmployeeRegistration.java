import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class EmployeeRegistration extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String eid= req.getParameter("id");
		String gender = req.getParameter("gender");
		String role = req.getParameter("role");
		String loc = req.getParameter("loc");
		String passport = req.getParameter("passport");
		PrintWriter out = resp.getWriter();
		out.println("Employee Details");
		out.println("ID : "+eid);
		out.println("Name : "+name);
		out.println("Gender : "+gender);
		out.println("Role : "+role);
		out.println("location : "+loc);
		if(passport!=null) {
			out.println("Has passport");
		}else {
			out.println("Do not have passport");
		}
		out.close();
		
	}
}
