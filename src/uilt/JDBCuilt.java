package uilt;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCuilt {
	static String driver = "";
	static String url = "";
	static String user = "";
	static String password = "";
	
	static {
		InputStream inStream = JDBCuilt.class.getClassLoader()
				.getResourceAsStream("config/db_properties.properties");
		Properties pre = new Properties();
		try {
			pre.load(inStream);
			driver = pre.getProperty("driver");
			url = pre.getProperty("url");
			user = pre.getProperty("user");
			password = pre.getProperty("password");
			try {
				Class.forName(driver);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getConn() {
		try {
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return null;
	}
	
	public static void CloseConn(Connection conn) {
		
		if(conn !=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
	
		
	}
}
