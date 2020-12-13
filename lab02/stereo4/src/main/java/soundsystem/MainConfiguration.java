package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({"classpath:META-INF/spring/configurationOne.xml", 
	             "classpath:META-INF/spring/configurationTwo.xml"})
public class MainConfiguration { 
	
	
}
