package spring_core_y.constructor_injections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		String path = "spring_core_y/injecting_collections/indian_citizen.xml";
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(path);
		context.getBean("e1");

		context.close();
	}

}
