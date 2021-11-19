import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetAllProductProc {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/productDB";
		String user = "root";
		String password = "dak1234561!)000";
		String procedure = "{call getAllProducts()}";
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,user, password);
		
		CallableStatement cs = con.prepareCall(procedure);
		ResultSet rs = cs.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
		
		cs.close();
		con.close();
	}
}
