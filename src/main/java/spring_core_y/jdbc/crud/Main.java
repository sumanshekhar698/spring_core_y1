package spring_core_y.jdbc.crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_core_y.test.Student;

public class Main {

	public static void main(String... strings) {
		String path = "spring_core_y/jdbc/crud/config.xml";
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(path);
		StudentDAOImpl studentDAO = context.getBean("studentDAO", StudentDAOImpl.class);
		System.out.println("*********************One Students ***********************");

		spring_core_y.jdbc.crud.Student s = studentDAO.getSingleStudent(4);
		System.out.println(s);
		
		ArrayList<Integer> students = new ArrayList<>();
		students.add(6);
		students.add(7);
		students.add(10);
		HashMap<Integer, spring_core_y.jdbc.crud.Student> multipleStudent = studentDAO.getMultipleStudent(students);

		System.out.println(multipleStudent);
//		int result = studentDAO.insert(new spring_core_y.jdbc.crud.Student(101, "Marrie", "London"));
//		System.out.println(result);

		int result = studentDAO.update(new spring_core_y.jdbc.crud.Student(101, "Mary", "Delhi"));
		System.out.println(result);

		System.out.println("*********************All Students ***********************");
		List<spring_core_y.jdbc.crud.Student> allStudents = studentDAO.getAllStudents();
		allStudents.forEach(System.out::println);

		int delete = studentDAO.delete(66);
		System.out.println(delete);

		System.out.println("*********************All Students after deletion ***********************");
		allStudents = studentDAO.getAllStudents();
		allStudents.forEach(System.out::println);

	}

}
