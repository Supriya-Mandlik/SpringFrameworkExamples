package in.AnnotationConfigurations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		// using xml configuration file
		String config_file_path = "/in/AnnotationConfigurations/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_file_path);
		
		Student std1 = (Student)context.getBean("student");
		std1.display();
		
		System.out.println("*---------------------------*");
		
		// using Java Configuration file
		
		ApplicationContext context2 = new AnnotationConfigApplicationContext(SpringJavaConfigFile.class);
		
		Student std2 = (Student) context.getBean("student");
		std2.display();
		
		
	}

}
