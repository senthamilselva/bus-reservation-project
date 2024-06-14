package BusResv;
1
import java.sql.*;

public class DbConnection {
	private static final String url = "jdbc:mysql://localhost:3306/senthil1";
	private static final String userName = "root";
	private static final String passWord = "Thenmozhi@123"; 
	
	public static Connection getConnection() throws SQLException{
		return  DriverManager.getConnection(url,userName,passWord);
	}

}