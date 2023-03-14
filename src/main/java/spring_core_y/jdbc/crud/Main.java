package spring_core_y.jdbc.crud;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_core_y.test.Student;

public class Main {

	public static void main(String[] args) {
		String path = "spring_core_y/jdbc/crud/config.xml";
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(path);
		StudentDAOImpl studentDAO = context.getBean("studentDAO", StudentDAOImpl.class);
		spring_core_y.jdbc.crud.Student s = studentDAO.getSingleStudent(4);
		System.out.println(s);

	}

}
