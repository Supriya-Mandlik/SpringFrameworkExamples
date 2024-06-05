package in.AnnotationConfigurations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("in.AnnotationConfigurations")
//@ComponentScan({"in.AnnotationConfigurations","",""})  if we have multiple packages
//@ComponentScan(basePackages = {"in.AnnotationConfigurations"} )
public class SpringJavaConfigFile {
	
}
