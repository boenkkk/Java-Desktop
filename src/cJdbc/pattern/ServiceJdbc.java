package cJdbc.pattern;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class ServiceJdbc {
	
	private PersonDaoJdbc personDao;
	private Connection connection;

	public void setDataSource(DataSource dataSource) {
		try {
			connection = dataSource.getConnection();
			personDao = new PersonDaoJdbc();
			personDao.setConnection(connection);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public Person save(Person person) {
		try {
			connection.setAutoCommit(false);
			personDao.save(person);
			connection.commit();
			connection.setAutoCommit(true);
		} catch (SQLException ex) {
			try {
				connection.rollback();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return person;
	}

	public Person delete(Person person) {
		try {
			connection.setAutoCommit(false);
			personDao.save(person);
			connection.commit();
			connection.setAutoCommit(true);
		} catch (SQLException ex) {
			try {
				connection.rollback();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return person;
	}

	public Person getPerson(Long id) {
		try {
			return personDao.getById(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<Person> getPersons() {
		try {
			return personDao.getAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new ArrayList<Person>();
	}
	
}
