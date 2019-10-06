package cJdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DMLDelete {

	public static void main(String[] args) {
		//deletePs();
		deletePsBatch();
	}
	
	public static void deletePs() {
		String id;
		Koneksi kon = new Koneksi();
		Connection con = kon.getCon();
		try {
			id = "5";
			String sql = "DELETE FROM java_db.t_person where id=?;";
			System.out.println("sql:"+sql);
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			
			int rs = ps.executeUpdate();
			System.out.println("rs:"+rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void deletePsBatch() {
		Koneksi kon = new Koneksi();
		Connection con = kon.getCon();
		try {
			String sql = "DELETE FROM java_db.t_person where id=?;";
			System.out.println("sql:"+sql);
			
			PreparedStatement ps = con.prepareStatement(sql);
			for (int i = 1; i <= 7; i++) {
				ps.setString(1, ""+i);
				ps.addBatch();
				System.out.println("Deleted Id : "+i);
			}
			
			int[] rs = ps.executeBatch();
			System.out.println("rs:"+rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}