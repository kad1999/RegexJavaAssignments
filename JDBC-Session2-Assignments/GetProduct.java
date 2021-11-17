import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetProduct {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String user = "root";
		String password = "dak1234561!)000";
		String url = "jdbc:mysql://localhost:3306/productDB";
		
		String query = "select * from product";
		
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
			System.out.println("ID: "+rs.getInt(1)+", Name: "+rs.getString(2)+", Price: "+rs.getInt(3));
		}
		
		st.close();
		con.close();
	}
}
