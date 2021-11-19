import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/adiDB";
		String user = "root";
		String password = "dak1234561!)000";
		
		String query1 = "UPDATE accounts set balance=balance-2000 where accno=11";
		String query2 = "UPDATE accounts set balance=balance+2000 where accno=22";
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, user, password);
		
		con.setAutoCommit(false);
		
		Statement st = con.createStatement();
		st.addBatch(query1);
		st.addBatch(query2);
		
		int[] result = st.executeBatch();
		
		if(result[0]==1 && result[1]==1) {
			con.commit();
			System.out.println("Transaction success");
		}else {
			con.rollback();
			System.out.println("Failed");
		}
		
		st.close();
		con.close();
	}
}
