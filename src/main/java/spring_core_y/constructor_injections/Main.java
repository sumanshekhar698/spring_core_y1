package spring_core_y.constructor_injections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		String path = "spring_core_y/constructor_injections/indian_citizen.xml";
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(path);
		Aadhar a1 = (Aadhar)context.getBean("a2");
		System.out.println(a1);
		
		

		
		IndianCitizen p1 =(IndianCitizen) context.getBean("p1");
		System.out.println(p1);
		context.close();
	}

}
