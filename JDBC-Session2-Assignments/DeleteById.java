import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteById {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String user = "root";
		String password = "dak1234561!)000";
		String url = "jdbc:mysql://localhost:3306/productDB";
		
		String query = "delete from product where id=?";
		Scanner sc = new Scanner(System.in);
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url, user, password);
		PreparedStatement ps = con.prepareStatement(query);
		
		System.out.println("Enter product id to delete: ");
		int id = sc.nextInt();
		ps.setInt(1, id);
		
		int rs = ps.executeUpdate();
		
		if(rs>0) {
			System.out.println("Record "+id+" Deleted successfuly");
		}else {
			System.out.println("Some error! Not deleted");
		}
		
		sc.close();
		ps.close();
		con.close();
	}
}
