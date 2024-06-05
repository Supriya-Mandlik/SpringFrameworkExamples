package in.javafile.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {
	
	@Bean                // @Bean("stdobj")
	public Student stdId1() {       //public Student createStdBeanObj()
	
		Student std = new Student();
		std.setName("Kamal");
		std.setRollno(103);
		std.setEmail("Kamal@gmail.com");
		return std;
		
	}
	
	@Bean
	public Student stdId2() {
		
		Student std = new Student();
		std.setName("Amit");
		std.setRollno(104);
		std.setEmail("amit@gmail.com");
		return std;
		
	}
	

}
