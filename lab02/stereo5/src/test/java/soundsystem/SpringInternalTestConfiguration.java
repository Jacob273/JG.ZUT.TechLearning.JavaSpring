package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile({"dev", "prod", "test"})
public class SpringInternalTestConfiguration {

	@Bean
	public TestResultsWrapper testResultsWrapper() {
		return new TestResultsWrapper();
	}
	
}
