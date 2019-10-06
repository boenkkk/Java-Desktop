package cJdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DMLUpdate {

	public static void main(String[] args) {
		updatePs();
	}
	
	public static void updatePs() {
		String id,name,pass;
		Koneksi kon = new Koneksi();
		Connection con = kon.getCon();
		try {
			id = "5";
			name = "aa";
			pass = "aa";
			String sql = "UPDATE java_db.t_person SET name=?, password=? WHERE id=?;";
			System.out.println("sql:"+sql);
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, pass);
			ps.setString(3, id);
			
			int rs = ps.executeUpdate();
			System.out.println("rs:"+rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}