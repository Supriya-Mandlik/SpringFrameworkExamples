package in.DependencyInjectionUsingJavaConfigConstructor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringJavaConfigFile {
	
	@Bean
	public Address createAddrObj() {
		
		Address addr = new Address(100,"pune",123321);
		
		return addr;
	}

	@Bean
	public Student createStdObj() {
		
		Student std = new Student("Deepak",100,createAddrObj());
		
		return std;
	}
	
}
