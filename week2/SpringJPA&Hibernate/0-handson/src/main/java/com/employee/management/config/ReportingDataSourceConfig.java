package com.employee.management.config;

import com.zaxxer.hikari.HikariDataSource;
import javax.sql.DataSource;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@EnableConfigurationProperties(ReportingDataSourceProperties.class)
public class ReportingDataSourceConfig {

    @Bean
    public DataSource reportingDataSource(ReportingDataSourceProperties reportingProperties) {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setJdbcUrl(reportingProperties.getUrl());
        dataSource.setDriverClassName(reportingProperties.getDriverClassName());
        dataSource.setUsername(reportingProperties.getUsername());
        dataSource.setPassword(reportingProperties.getPassword());
        return dataSource;
    }

    @Bean
    public JdbcTemplate reportingJdbcTemplate(DataSource reportingDataSource) {
        return new JdbcTemplate(reportingDataSource);
    }
}