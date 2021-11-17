import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class GetProductByName {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String user = "root";
		String password = "dak1234561!)000";
		String url = "jdbc:mysql://localhost:3306/productDB";
		
		String query = "select * from product where name=?";
		Scanner sc = new Scanner(System.in);
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url, user, password);
		PreparedStatement ps = con.prepareStatement(query);
		
		System.out.println("Enter product name: ");
		String name = sc.next();
		ps.setString(1, name);
		
		ResultSet rs = ps.executeQuery();
		
		if(!rs.next()) {
			System.out.println("No such product name found");
		}else {
			do {
				System.out.println("ID: "+rs.getInt(1)+", Name: "+rs.getString(2)+", Price: "+rs.getInt(3));
			}while(rs.next());
		}
		
		sc.close();
		ps.close();
		con.close();
	}
}
