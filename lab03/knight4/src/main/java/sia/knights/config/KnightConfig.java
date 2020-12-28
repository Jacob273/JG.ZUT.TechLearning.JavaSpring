package sia.knights.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import sia.knights.BlackHorse;
import sia.knights.BraveKnight;
import sia.knights.Horse;
import sia.knights.Knight;
import sia.knights.Minstrel;
import sia.knights.Quest;
import sia.knights.SlayDragonQuest;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("sia.knights")
public class KnightConfig {

	@Bean
	public Knight knight() {
		return new BraveKnight(quest());
	}

	@Bean
	public Quest quest() {
		return new SlayDragonQuest();
	}

	@Bean
	public Horse horse() {
		return new BlackHorse();
	}
	
	@Bean
	public Minstrel getMinstrel() {
		return new Minstrel();
	}
	
}
