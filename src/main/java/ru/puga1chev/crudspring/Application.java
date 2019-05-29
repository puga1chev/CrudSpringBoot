package ru.puga1chev.crudspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@EnableTransactionManagement
@Configuration
@EnableConfigurationProperties
@SpringBootApplication(
		exclude = {
				/*DataSourceAutoConfiguration.class,
				HibernateJpaAutoConfiguration.class,
				DataSourceTransactionManagerAutoConfiguration.class*/
				SecurityAutoConfiguration.class
		},
		scanBasePackages = "ru.puga1chev.crudspring"
)
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
