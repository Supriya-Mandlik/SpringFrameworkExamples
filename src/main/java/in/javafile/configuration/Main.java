package in.javafile.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		Student std1 = (Student) context.getBean("stdId1");
		std1.display();
		
		//Student std = context.getBean(Student.class);
		//std.display();
		
		//Student std = (Student) context.getBean("stdobj");
		//std.display();
		
		Student std2 = (Student) context.getBean("stdId2");
		std2.display();
		
	}

}
