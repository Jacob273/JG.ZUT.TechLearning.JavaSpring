package sia.knights;

import static org.mockito.Mockito.mock;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Primary;

import sia.knights.BraveKnight;
import sia.knights.Knight;
import sia.knights.Quest;
import sia.knights.SlayDragonQuest;
import sia.knights.config.KnightConfig;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class KnightTestConfig {

  @Bean
  public Knight knight() {
    return new BraveKnight(quest());
  }

  	@Bean
  	@Primary
  	public Quest quest() {
	  return new SlayDragonQuest();
    }
			
}
