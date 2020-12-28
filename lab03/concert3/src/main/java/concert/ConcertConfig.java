package concert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Primary;

@Configuration
@EnableAspectJAutoProxy
public class ConcertConfig {

	@Primary
	@Bean(name = "w1")
	public Performance getPerformance() {
		return new Woodstock();
	}

	@Bean(name = "w2")
	public Performance getPerformance2() {
		return new Woodstock2();
	}
	
	@Bean
	public Audience getAudience() {
		return new Audience();
	}
}
