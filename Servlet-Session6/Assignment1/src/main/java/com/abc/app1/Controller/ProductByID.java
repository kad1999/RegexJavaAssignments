package com.abc.app1.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProductByID extends HttpServlet{

	Connection con = null;
	PreparedStatement ps = null;
	String query = "select * from product where id=?";

	@Override
	public void init(ServletConfig config) throws ServletException {
		String driver = config.getInitParameter("driver");
		String url = config.getInitParameter("url");
		String user= config.getInitParameter("user");
		String password = config.getInitParameter("password");
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		
		PrintWriter out = resp.getWriter();
		
		try {
			ps = con.prepareStatement(query);
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			if(rs!=null) {
				while(rs.next()) {
					out.println("<h1>ID: "+rs.getInt(1)+", Product name : "+rs.getString(2)+", Price: "+rs.getInt(3)+"</h1>");
				}
			}
			rs.close();
			
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
