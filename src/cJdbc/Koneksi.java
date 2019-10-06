package cJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
	
	private String url, user, pass;
	
	public Connection getCon() {
		try {
			url = "jdbc:mysql://localhost:3306/java_db";
			user = "root";
			pass = "root";
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url,user,pass);
			return conn;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
