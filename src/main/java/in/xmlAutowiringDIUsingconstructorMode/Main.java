package in.xmlAutowiringDIUsingconstructorMode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// by using constructor mode of autowire  

public class Main {
	
	public static void main(String[] args) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("in/xmlAutowiringDIUsingconstructorMode/applicationContext.xml");
		
	Student std = (Student) context.getBean("stdId");
	std.display();
	
	}

}
