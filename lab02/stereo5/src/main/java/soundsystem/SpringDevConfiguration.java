package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import java.util.Arrays;


//spring configuration to be used on dev environment
@Configuration
@Profile("dev")
@PropertySource("classpath:META-INF/spring/jg-app.properties")
public class SpringDevConfiguration {
	
	@Autowired
	private Environment env;

	@Bean
	public CompactDisc theQemistsDisc() { 
		
		String titleName = env.getProperty("app.cd1.titleName");
		String artistName = env.getProperty("app.cd1.artistName");
		String track1 = env.getProperty("app.cd1.track1");
		String track2 = env.getProperty("app.cd1.track2");
		String track3 = env.getProperty("app.cd1.track3");
		
		return new BlankDisc(titleName, artistName, Arrays.asList(track1, track2, track3));
	}

}
