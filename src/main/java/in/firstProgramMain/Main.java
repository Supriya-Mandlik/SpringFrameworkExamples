package in.firstProgramMain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.firstProgramStudent.Student;

public class Main {

	public static void main(String[] args) {
	
		String config_loc = "in/firstProgramResources/applicationContext.xml";
	ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
	
	Student std = (Student) context.getBean("stdId");
	std.display();
	
	System.out.println("*------------------*");
	
	Student std2 =(Student) context.getBean("stdId2");
	std2.display();
		
	}
	
}
