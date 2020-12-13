package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Profile({"dev", "prod", "test"})
@Configuration
public class SpringBaseConfiguration {

	@Bean
	public MediaPlayer mediaPlayer() {
		return new CDPlayer();
	}
	
}
