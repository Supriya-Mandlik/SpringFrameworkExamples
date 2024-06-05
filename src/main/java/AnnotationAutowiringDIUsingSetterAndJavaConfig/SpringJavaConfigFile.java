package AnnotationAutowiringDIUsingSetterAndJavaConfig;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringJavaConfigFile {
	
	@Bean
	public Address createAddrObj() {
		
		Address addr = new Address();
		addr.setHouseno(100);
		addr.setCity("Delhi");
		addr.setPincode(123321);
		
		return addr;
	}
	
	@Bean
	public Address createAddrObj2() {
		
		Address addr = new Address();
		addr.setHouseno(200);
		addr.setCity("pune");
		addr.setPincode(987654);
		
		return addr;
	}
	
	@Bean
	public Subjects createSubObj() {
		
		Subjects sub = new Subjects();
	
		List<String> subList = new ArrayList<String>();
		subList.add("Java");
		subList.add("Python");
		subList.add("c++");
		
		sub.setSubjects(subList);
		
		return sub;
		
	}
	
	
	@Bean
	public Student createStdObj() {
		
		Student std = new Student();
		std.setName("Deepak");
		std.setRollno(121);
		
		/* There is no need to set address and subjects manually,because of autowiring-@Autowired
		 annotation spring does it automatically .*/
		
		return std;
	}
	

}
