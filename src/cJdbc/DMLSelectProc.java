package cJdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DMLSelectProc {

	public static void main(String[] args) {
		select();
		//selectId();
	}
	
	public static void select() {
		String id,name,pass;
		Koneksi kon = new Koneksi();
		Connection con = kon.getCon();
		try {
			String sql = "{call get_person}";
			System.out.println("sql:"+sql);
			
			CallableStatement cs = con.prepareCall(sql);
			
			ResultSet rs = cs.executeQuery();
			System.out.println("rs:"+rs);
			while(rs.next()) {
				id = rs.getString("ID"); 
				name = rs.getString("NAME");
				pass = rs.getString("PASSWORD");
				System.out.println("ID:"+id+"|NAME:"+name+"|pass:"+pass);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void selectId() {
		String id,name,pass;
		Koneksi kon = new Koneksi();
		Connection con = kon.getCon();
		try {
			String sql = "{call get_person_by_id(?)}";
			System.out.println("sql:"+sql);
			
			CallableStatement cs = con.prepareCall(sql);
			cs.setInt(1, 5);
			
			ResultSet rs = cs.executeQuery();
			System.out.println("rs:"+rs);
			while(rs.next()) {
				id = rs.getString("ID"); 
				name = rs.getString("NAME");
				pass = rs.getString("PASSWORD");
				System.out.println("ID:"+id+"|NAME:"+name+"|pass:"+pass);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
