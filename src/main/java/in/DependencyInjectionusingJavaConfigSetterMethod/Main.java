package in.DependencyInjectionusingJavaConfigSetterMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
	ApplicationContext context = new AnnotationConfigApplicationContext(SpringJavaConfigFile.class);
	
	Student std1 = context.getBean(Student.class);
	std1.display();	
	
	}

}
