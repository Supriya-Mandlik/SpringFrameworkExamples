package xmlAutowiringDIUsingsetterAndxmlConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// by using byName mode of autowire  

public class Main {
	
	public static void main(String[] args) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("xmlAutowiringDIUsingsetterAndxmlConfig/applicationContext.xml");
		
	Student std = (Student) context.getBean("stdId");
	std.display();
	
	}

}
