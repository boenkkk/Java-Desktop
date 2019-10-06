package cJdbc.pattern;

import java.sql.SQLException;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class MainJdbc {
	
	public static void main(String[] args) {
		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setUser("root");
		dataSource.setPassword("root");
		dataSource.setDatabaseName("java_db");
		dataSource.setServerName("localhost");
		dataSource.setPortNumber(3306);

		ServiceJdbc service = new ServiceJdbc();
		service.setDataSource(dataSource);

		Person person = new Person();
		person.setName("administrator");
		person.setPassword("pwd");
		service.save(person);

		System.out.println("id : " + person.getId());
		System.out.println("name: " + person.getName());

		try {
			dataSource.getConnection().close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
}