package com.bachelorpreof.SOA.webshop.datasource;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.bachelorpreof.SOA.webshop.properties.UserDatasourceProperties;

@Configuration
public class UserJdbcComponent {
	
	private final UserDatasourceProperties properties;
	
	public UserJdbcComponent(UserDatasourceProperties properties) {
		this.properties = properties;
	}
	
	public DataSource primaryDataSourceProperties() {
		return DataSourceBuilder.create()
				.url(properties.getUrl())
				.username(properties.getUsername())
				.password(properties.getPassword())
				.build();
	}
	
	  @Bean(name = "userJdbcTemplate")
	  public NamedParameterJdbcTemplate userJdbcTemplate() {
	    return new NamedParameterJdbcTemplate(primaryDataSourceProperties());
	  }
}
