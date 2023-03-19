package spring_core_y.jdbc.crud;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

	@Override
	public List<Student> getAllStudents() {
		String query = "SELECT * FROM STUDENT";

		RowMapper<Student> rowMapper = new RowMapper<Student>() {

			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {// rs 1 : ID 2: Name 3 : City
				return new Student(rs.getInt(1), rs.getString(2), rs.getString(3));
			}
		};

		List<Student> listOfStudents = this.jdbc.query(query, rowMapper);
		return listOfStudents;
	}

	@Override
	public int insert(Student s) {

		String query = "INSERT INTO STUDENT VALUES(?, ?, ?)";
		int update = this.jdbc.update(query, s.getId(), s.getName(), s.getCity());
		return update;
	}

	@Override
	public int update(Student s) {
		String query = "UPDATE STUDENT SET NAME=? , CITY=? WHERE ID=?";
		int update = this.jdbc.update(query, s.getName(), s.getCity(), s.getId());
		return update;
	}

	@Override
	public int delete(int ID) {
		String query = "DELETE FROM STUDENT WHERE ID = ?";
		int update = this.jdbc.update(query, ID);
		return update;
	}

	@Override
	public HashMap<Integer, Student> getMultipleStudent(List<Integer> idS) {
		String query = "SELECT * FROM STUDENT WHERE ID = ?";
		HashMap<Integer, Student> mapOfStudents = new HashMap<>();
		

		for (Integer id : idS) {
			try {
				Student s = this.jdbc.queryForObject(query, new RowMapper<Student>() {

					@Override
					public Student mapRow(ResultSet rs, int rowNum) throws SQLException {// rs 1 : ID 2: Name 3 : City
						return new Student(rs.getInt(1), rs.getString(2), rs.getString(3));
					}
				}, id);
				mapOfStudents.put(id, s);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}

		return mapOfStudents;
	}

}
