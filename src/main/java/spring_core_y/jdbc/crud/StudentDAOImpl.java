package spring_core_y.jdbc.crud;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentDAOImpl implements StudentDAO {

	private JdbcTemplate jdbc;

	public StudentDAOImpl() {
		super();
	}

	public StudentDAOImpl(JdbcTemplate jdbc) {
		super();
		this.jdbc = jdbc;
	}

	@Override
	public String toString() {
		return "StudentDAOImpl [jdbc=" + jdbc + "]";
	}

	public JdbcTemplate getJdbc() {
		return jdbc;
	}

	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	@Override
	public Student getSingleStudent(int id) {// SQL Injection
		String query = "SELECT * FROM STUDENT WHERE ID = ?";
		Student s = this.jdbc.queryForObject(query, new RowMapper<Student>() {

			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {// rs 1 : ID 2: Name 3 : City
				return new Student(rs.getInt(1), rs.getString(2), rs.getString(3));
			}
		}, id);
		return s;
	}

}
