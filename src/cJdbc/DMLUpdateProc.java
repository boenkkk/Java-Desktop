package cJdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class DMLUpdateProc {
	
	public static void main(String[] args) {
		update();
	}
	
	public static void update() {
		Koneksi kon = new Koneksi();
		Connection con = kon.getCon();
		try {
			String sql = "{call update_person_by_id(?,?,?)}";
			System.out.println("sql:"+sql);
			
			CallableStatement cs = con.prepareCall(sql);
			cs.setInt(1, 5);
			cs.setString(2, "User");
			cs.setString(3, "Pass 5");
			
			int rs = cs.executeUpdate();
			System.out.println("rs:"+rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
