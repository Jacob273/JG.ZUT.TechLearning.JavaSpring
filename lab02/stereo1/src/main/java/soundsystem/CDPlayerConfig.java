package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig { 


	@Bean
	public CompactDisc comptactDisc() {
		return new SgtPeppers();
	}	
	
	@Bean
	public MediaPlayer mediaPlayer() {
		return new CDPlayer();
	}	
	
}
