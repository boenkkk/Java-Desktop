package cJdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DMLSelect {

	public static void main(String[] args) {
		//selectSt();
		//selectPs();
		selectPsGetColAndData();
		//getLastId();
		//getLastId2();
	}
	
	public static void selectSt() {
		String id,name,pass;
		Koneksi kon = new Koneksi();
		Connection con = kon.getCon(); 
		try {
			Statement st = con.createStatement();
			
			name = "a' or 1=1 --";
			pass = "";
			String sql = "select * from java_db.t_person where name = '"+name+"' and password = '"+pass+"';";
			
			ResultSet rs = st.executeQuery(sql);
			System.out.println("rs:"+rs);
			
			while (rs.next()) { 
				id = rs.getString("ID"); 
				name = rs.getString("NAME");
				pass = rs.getString("PASSWORD");
				System.out.println("ID:"+id+"|NAME:"+name+"|pass:"+pass);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		/*Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db", "root", "root");
		Statement statement = (Statement) conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet rs = statement.executeQuery("select * from T_PERSON");
		while (rs.next()) {
			System.out.println(rs.getInt("id"));
			System.out.println(rs.getString("name"));
		}*/
	}
	
	public static void selectPs() {
		String id,name,pass;
		Koneksi kon = new Koneksi();
		Connection con = kon.getCon(); 
		try {
			name = "a";
			pass = "a";
			String sql = "select * from java_db.t_person where name = ? and password = ?;";
			System.out.println("sql:"+sql);
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, pass);
			
			ResultSet rs = ps.executeQuery();
			System.out.println("rs:"+rs);
			
			while (rs.next()) { 
				id = rs.getString("ID"); 
				name = rs.getString("NAME");
				pass = rs.getString("PASSWORD");
				System.out.println("ID:"+id+"|NAME:"+name+"|pass:"+pass);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void selectPsGetColAndData() {
		String id,name,pass;
		List<String> lis = new ArrayList<String>();
		Koneksi kon = new Koneksi();
		Connection con = kon.getCon(); 
		try {
			String sql = "select * from java_db.t_person;";
			System.out.println("sql:"+sql);
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			System.out.println("rs:"+rs);
			
			ResultSetMetaData metaData = rs.getMetaData();
			int colMetaData = metaData.getColumnCount();
			for (int i = 1; i <= colMetaData; i++) {
				String colName = metaData.getColumnName(i);
				String[] colArr = new String[]{colName};
				lis.addAll(Arrays.asList(colArr));
			}
			String colArr2 = String.join("|", lis);
			System.out.println(colArr2);
			
			while (rs.next()) { 
				id = rs.getString("ID"); 
				name = rs.getString("NAME");
				pass = rs.getString("PASSWORD");
				System.out.println(id+"|"+name+"|"+pass);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	


	public static void getLastId() {
		Koneksi kon = new Koneksi();
		Connection con = kon.getCon();
		try {
			String sql = "INSERT INTO java_db.t_person (name,password) VALUES (?,?)";
			System.out.println("sql:"+sql);
			
			PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			ps.setString(1,"diana");
			ps.setString(2,"pwddian");
			ps.executeUpdate();
			
			ResultSet rs = ps.getGeneratedKeys();
			rs.next();
			Long id = rs.getLong(1);
			System.out.println("Last id:"+id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void getLastId2() {
		String id,name,pass;
		Koneksi kon = new Koneksi();
		Connection con = kon.getCon(); 
		try {
			String sql = "select * from java_db.t_person;";
			System.out.println("sql:"+sql);
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			System.out.println("rs:"+rs);
			
			while (rs.next()) { 
				id = rs.getString("ID"); 
				name = rs.getString("NAME");
				pass = rs.getString("PASSWORD");
				System.out.println("ID:"+id+"|NAME:"+name+"|pass:"+pass);
			}
			
			ResultSet rs2 = ps.getGeneratedKeys();
			rs2.next();
			Long id2 = rs2.getLong(1);
			System.out.println("Last id:"+id2);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}