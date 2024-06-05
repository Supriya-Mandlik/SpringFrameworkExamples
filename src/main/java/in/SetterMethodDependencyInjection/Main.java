package in.SetterMethodDependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		String config_file_loc = "in/SetterMethodDependencyInjection/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_file_loc);
		
		Student std = (Student)context.getBean("stdId");
		System.out.println(std);
		
		/* if scope of the bean is singleton(bydefault)-spring will create only one object
		//everytime spring will pass the same object
		Student stu1 = (Student)context.getBean("stdId");
		Student stu2 = (Student)context.getBean("stdId");
		
		System.out.println(stu1==stu2);  //true */
		
		// if scope of the bean is prototype-everytime spring will create new object
				Student stu1 = (Student)context.getBean("stdId");
				Student stu2 = (Student)context.getBean("stdId");
				
				System.out.println(stu1==stu2);  //false
		
		System.out.println("------------------------------");
		
		System.out.println("Without Using Spring:-");
		
		Address add = new Address();
		add.setHouseno(101);
		add.setCity("Akole");
		add.setPincode(422601);
		
		Student stuObjWithoutSpring = new Student();
		stuObjWithoutSpring.setName("Supriya Mandlik");
		stuObjWithoutSpring.setRollno(8);
		stuObjWithoutSpring.setAddress(add);
		
		System.out.println(stuObjWithoutSpring);
		
		
	}

}
