package com.luv2code.springdemo;

import javax.sql.DataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class JdbcConfig {

	//https://howtodoinjava.com/spring-boot2/datasource-configuration/
    @Bean(name = "mySqlDataSource")
    @Primary
	public DataSource mySqlDataSource()
    {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false&serverTimezone=UTC");
        dataSourceBuilder.username("springstudent");
        dataSourceBuilder.password("springstudent");
        return dataSourceBuilder.build();
    }
    
}
