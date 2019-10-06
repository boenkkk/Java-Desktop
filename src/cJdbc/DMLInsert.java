package cJdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DMLInsert {

	public static void main(String[] args) {
		//insertPs();
		insertPsBatch();
		//insertPsTrans();
	}
	
	public static void insertPs() {
		String id,user,pass;
		Koneksi kon = new Koneksi();
		Connection con = kon.getCon();
		try {
			id = "5";
			user = "e";
			pass = "e";
			String sql = "INSERT INTO java_db.t_person VALUES(?,?,?);";
			System.out.println("sql:"+sql);
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, user);
			ps.setString(3, pass);
			
			int rs = ps.executeUpdate();
			System.out.println("rs:"+rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void insertPsBatch() {
		Koneksi kon = new Koneksi();
		Connection con = kon.getCon();
		try {
			String sql = "INSERT INTO java_db.t_person (name, password) VALUES(?,?);";
			System.out.println("sql:"+sql);
			
			PreparedStatement ps = con.prepareStatement(sql);
			for (int i = 1; i <= 7; i++) {
				ps.setString(1, "user "+i);
				ps.setString(2, "pass "+i);
				ps.addBatch();
			}
			
			int[] rs = ps.executeBatch();
			System.out.println("rs:"+rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void insertPsTrans() {
		Koneksi kon = new Koneksi();
		Connection con = kon.getCon();
		try {
			String sql = "INSERT INTO java_db.t_person (name, password) VALUES(?,?);";
			System.out.println("sql:"+sql);
			
			con.setAutoCommit(false);
			PreparedStatement ps = con.prepareStatement(sql);
			for (int i = 1; i <= 150; i++) {
				ps.setString(1, "user "+i);
				ps.setString(2, "pass "+i);
				ps.addBatch();
			}
			
			int[] rs = ps.executeBatch();
			System.out.println("rs:"+rs);
			con.commit();
			con.setAutoCommit(true);
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
	}
	
}