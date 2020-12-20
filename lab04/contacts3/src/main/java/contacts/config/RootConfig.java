package contacts.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import contacts.data.ContactsRepository;
import contacts.data.ContactsRepositoryImpl;

@Configuration
@ComponentScan(basePackages={"contacts"}, excludeFilters={@Filter(type=FilterType.ANNOTATION, value=EnableWebMvc.class)
})
public class RootConfig {
	
	@Bean
	public ContactsRepository contactsRepository() {
		return new ContactsRepositoryImpl();
	}
}
