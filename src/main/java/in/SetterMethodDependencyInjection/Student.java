package in.SetterMethodDependencyInjection;

public class Student {
	
	private String name;
	private int rollno;
	private Address address;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", address=" + address + "]";
	}
	
	

}
