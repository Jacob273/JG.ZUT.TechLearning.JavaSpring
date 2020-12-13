package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@Profile("test")
public class SpringTestConfiguration {
		
	@Bean
	public MediaPlayer mediaPlayer() {
		return new CDPlayer();
	}
		
	@Bean
	public CompactDisc theSgtPeppers() {  
		return new SgtPeppersDisc();
	}

}
