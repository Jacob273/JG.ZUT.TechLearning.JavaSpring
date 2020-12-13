package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import java.util.Arrays;


//spring configuration to be used on production
@Configuration
@Profile("prod")
public class SpringProdConfiguration {
	
	@Bean
	public CompactDisc theFiftyCentDisc() {  
		return new BlankDisc("Get rich or die trying", "Fifty Cent", Arrays.asList("Track111", "Track222", "Track333"));
	}

}
