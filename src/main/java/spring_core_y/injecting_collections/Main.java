package spring_core_y.injecting_collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		String path = "spring_core_y/injecting_collections/employee_data.xml";
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(path);
		Employee emp1 = (Employee) context.getBean("e1");
		System.out.println(emp1);
		System.out.println(emp1.getAddress().size());//5
		context.close();
	}

}
