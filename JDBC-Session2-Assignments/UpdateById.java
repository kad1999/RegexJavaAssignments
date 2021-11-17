import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateById {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String user = "root";
		String password = "dak1234561!)000";
		String url = "jdbc:mysql://localhost:3306/productDB";
		
		String query = "update product set name=?, price=? where id=?";
		Scanner sc = new Scanner(System.in);
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url, user, password);
		PreparedStatement ps = con.prepareStatement(query);
		
		System.out.println("Enter id: ");
		int id = sc.nextInt();
		System.out.println("Enter product name: ");
		String name = sc.next();
		System.out.println("Enter product price");
		int price = sc.nextInt();
		
		ps.setString(1, name);
		ps.setInt(2, price);
		ps.setInt(3, id);
		
		
		int rs = ps.executeUpdate();
		if(rs>0) {
			System.out.println("Product details updated");
		}else {
			System.out.println("Not updated");
		}
	
		sc.close();
		ps.close();
		con.close();
	}
}
