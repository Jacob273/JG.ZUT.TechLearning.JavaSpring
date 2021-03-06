package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;


//spring configuration to be used on test environment
@Configuration
@Profile("test")
public class SpringTestConfiguration {
		
	@Bean
	public CompactDisc theSgtPeppers() {  
		return new SgtPeppersDisc();
	}

}
