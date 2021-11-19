import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class GetProductInfo {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/productDB";
		String user = "root";
		String password = "dak1234561!)000";
		String procedure = "{call getProductInfo(?)}";
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,user, password);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product id to get info : ");
		int id = sc.nextInt();
		
		CallableStatement cs = con.prepareCall(procedure);
		cs.setInt(1, id);
		
		ResultSet rs = cs.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
		
		sc.close();
		cs.close();
		con.close();
	}
}
