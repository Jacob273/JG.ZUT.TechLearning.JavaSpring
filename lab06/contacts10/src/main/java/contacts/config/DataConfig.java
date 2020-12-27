package contacts.config;

import java.io.IOException;
import java.util.Properties;

import javax.persistence.EntityManagerFactory;
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
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
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
  public HibernateJpaVendorAdapter jpaVendorAdapter() {
	  HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
	  adapter.setDatabase(Database.H2);
	  adapter.setShowSql(false);
	  adapter.setGenerateDdl(true);
	  return adapter;
  }
  
  @Bean
  public EntityManagerFactory entityManagerFactory() {
	  LocalContainerEntityManagerFactoryBean emf = new
	  LocalContainerEntityManagerFactoryBean();
	  emf.setDataSource(dataSource());
	  emf.setJpaVendorAdapter(jpaVendorAdapter());
	  emf.setPersistenceUnitName("contactsPU");
	  emf.setPackagesToScan("contacts");
	  emf.afterPropertiesSet();
	  return emf.getObject();
  }
  
  @Bean
  public PlatformTransactionManager transactionManager() {
	  JpaTransactionManager txManager = new JpaTransactionManager();
	  txManager.setEntityManagerFactory(entityManagerFactory());
	  return txManager;
  }
  
  @Bean
  public JdbcOperations jdbcTemplate(DataSource dataSource) {
    return new JdbcTemplate(dataSource);
  }

}
