package in.DependencyInjectionUsingConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		String config_file_loc="in/DependencyInjectionUsingConstructor/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_file_loc);
		
		Student std = (Student) context.getBean("stdId");
		std.display();
		
	}

}
