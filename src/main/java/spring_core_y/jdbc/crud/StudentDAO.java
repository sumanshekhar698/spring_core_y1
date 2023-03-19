package spring_core_y.jdbc.crud;

import java.util.HashMap;
import java.util.List;

public interface StudentDAO {

//	C
	public int insert(Student s);

//	R
	public Student getSingleStudent(int id);

	public HashMap<Integer, Student> getMultipleStudent(List<Integer> idS);

	public List<Student> getAllStudents();

//	U
	public int update(Student s);

//	D
	public int delete(int ID);

}
