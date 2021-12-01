package com.abc.app1.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddProduct extends HttpServlet{
	Connection con = null;
	PreparedStatement ps = null;
	String query = "insert into product values(?,?,?)";

	@Override
	public void init(ServletConfig config) throws ServletException {
		ServletContext context = config.getServletContext();
		String driver = context.getInitParameter("driver");
		String url = context.getInitParameter("url");
		String user= context.getInitParameter("user");
		String password = context.getInitParameter("password");
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void doPost(HttpServletRequest req, javax.servlet.http.HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		int price =Integer.parseInt(req.getParameter("price"));
		
		
		PrintWriter out = resp.getWriter();
		
		try {
			ps = con.prepareStatement(query);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, price);
			int status = ps.executeUpdate();
			
			if(status==1) {
				out.println("Product added ");
			}else {
				out.println("Some error. Could not add.");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	@Override
	public void destroy() {			
			try {
				if(ps!=null) {
					ps.close();
				}
				if(con!=null) {
					con.close();
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}
}
