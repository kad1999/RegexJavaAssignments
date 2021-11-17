import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteByName {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String user = "root";
		String password = "dak1234561!)000";
		String url = "jdbc:mysql://localhost:3306/productDB";
		
		String query = "delete from product where name=?";
		Scanner sc = new Scanner(System.in);
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url, user, password);
		PreparedStatement ps = con.prepareStatement(query);
		
		System.out.println("Enter product name to delete: ");
		String name = sc.next();
		ps.setString(1, name);
		
		int rs = ps.executeUpdate();
		
		if(rs>0) {
			System.out.println("Record with name "+name+" Deleted successfuly");
		}else {
			System.out.println("Some error! Not deleted");
		}
		
		sc.close();
		ps.close();
		con.close();
	}
}
