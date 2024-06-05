package AnnotationAutowiringDIUsingSetterAndJavaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	
	private String name;
	private int rollno;
	
	@Autowired
	@Qualifier("createAddrObj2")
	private Address address;
	/* if we have two bean objects then spring gives error because it gets confused which object 
	should print , to resolve this ambiguity we use another annotation @Qualifier- it prints 
	the specific object which we want to print */
	
	@Autowired     
	private Subjects subjects;
	// if we have only one bean object then we can use only @Autowired
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public void display() {
		System.out.println("Name:"+name);
		System.out.println("Rollno:"+rollno);
		System.out.println("Address:"+address);
		System.out.println("Subjects:"+subjects);
	}
	

}
