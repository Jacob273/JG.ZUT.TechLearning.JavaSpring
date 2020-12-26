package contacts.config;

import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan
public class DataConfig {

  @Bean
  public DataSource dataSource() {
    return new EmbeddedDatabaseBuilder()
            .setType(EmbeddedDatabaseType.H2)
            .addScript("schema.sql")
            .addScript("data.sql")
            .build();
  }
  
  @Bean
  public SessionFactory sessionFactoryBean() throws IOException {
	  LocalSessionFactoryBean lsfb = new LocalSessionFactoryBean();
	  lsfb.setDataSource(dataSource());
	  // nazwa pakietu do wyszukania klas utrwalanych obiektów
	  lsfb.setPackagesToScan("contacts");
	  Properties props = new Properties();
	  props.setProperty("dialect", "org.hibernate.dialect.H2Dialect");
	  lsfb.setHibernateProperties(props);
	  lsfb.afterPropertiesSet();
	  SessionFactory object = lsfb.getObject();
	  return object;
  }

  @Bean
  public PlatformTransactionManager annotationDrivenTransactionManager() throws
	  IOException {
	  HibernateTransactionManager transactionManager = new HibernateTransactionManager();
	  transactionManager.setSessionFactory(sessionFactoryBean());
	  return transactionManager;
  }
  
  @Bean
  public JdbcOperations jdbcTemplate(DataSource dataSource) {
    return new JdbcTemplate(dataSource);
  }

}
