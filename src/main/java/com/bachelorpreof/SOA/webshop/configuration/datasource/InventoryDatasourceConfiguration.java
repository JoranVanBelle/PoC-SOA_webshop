package com.bachelorpreof.SOA.webshop.configuration.datasource;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.bachelorpreof.SOA.webshop.properties.InventoryDatasourceProperties;

@Configuration
@EnableConfigurationProperties(InventoryDatasourceProperties.class)
public class InventoryDatasourceConfiguration {

}
