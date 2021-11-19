import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductAddBatch {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/productDB";
		String user = "root";
		String password = "dak1234561!)000";
		String[] queries = {
				"Insert into Product values(106,'mobile',50000)",
				"Insert into Product values(107,'pouch',66)"
		};
		
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url,user, password);
		Statement st = con.createStatement();
		for (String query : queries) {
			st.addBatch(query);
		}
		int[] res = st.executeBatch();

		System.out.println(res.length);
		if(res[0]==1 && res[1]==1) {
			System.out.println("Insertion success");
		}else {
			System.out.println("Some error");
		}
		st.close();
		con.close();
	}
}
