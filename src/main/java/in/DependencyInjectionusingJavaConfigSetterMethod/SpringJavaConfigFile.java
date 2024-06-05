package in.DependencyInjectionusingJavaConfigSetterMethod;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringJavaConfigFile {
	
	@Bean
	public Address createAddrObj() {
		
		Address addr = new Address();
		
		addr.setHouseno(100);
		addr.setCity("Delhi");
		addr.setPincode(123456);
		
		return addr;
	}
	
	@Bean
	public Student createStdObj() {
		
		Student std = new Student();
		
		std.setName("Deepak");
		std.setRollno(101);
		std.setAddress(createAddrObj());
		
		return std;
	}

}
