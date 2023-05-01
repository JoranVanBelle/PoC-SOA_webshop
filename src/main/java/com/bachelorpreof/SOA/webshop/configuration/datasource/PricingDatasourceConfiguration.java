package com.bachelorpreof.SOA.webshop.configuration.datasource;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.bachelorpreof.SOA.webshop.properties.PricingDatasourceProperties;

@Configuration
@EnableConfigurationProperties(PricingDatasourceProperties.class)
public class PricingDatasourceConfiguration {

}
