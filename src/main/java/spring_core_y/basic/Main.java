package spring_core_y.basic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		Student s1 = new Student("Neils", 23);
		// you are the person who is creating this object
		// you need to manage its life cycle (object(java bean) life cycle)

		System.out.println(s1);
		s1 = null;

		String path ="simple_pojo_of_student.xml";
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(path);
		
		Student s2 = (Student)context.getBean("s2");
		System.out.println(s2);
		System.out.println(s2.hashCode());
		
		Student s3 = (Student)context.getBean("s3");
		System.out.println(s3);
		
		Student s2_ = (Student)context.getBean("s2");//By default Spring uses Singleton Pattern
		System.out.println(s2_.hashCode());

	}

}
