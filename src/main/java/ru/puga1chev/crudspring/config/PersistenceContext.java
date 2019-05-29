package ru.puga1chev.crudspring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import javax.sql.DataSource;

@Configuration
@EnableJpaAuditing/*(dateTimeProviderRef = "dateTimeProvider")*/
@EnableJpaRepositories(basePackages = {
        "ru.puga1chev.crudspring.dao"
})
@EnableTransactionManagement
class PersistenceContext {

    @Bean
    NamedParameterJdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new NamedParameterJdbcTemplate(dataSource);
    }
}