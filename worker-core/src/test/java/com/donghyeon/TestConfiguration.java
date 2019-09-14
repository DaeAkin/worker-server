package com.donghyeon;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
//@EnableJpaRepositories(repositoryFactoryBeanClass = org.springframework.data.jpa.datatables.repository.DataTablesRepositoryFactoryBean.class,
//        basePackages = "kr.co.well_buy.server")
//@EnableMongoRepositories(repositoryFactoryBeanClass = org.springframework.data.mongodb.datatables.DataTablesRepositoryFactoryBean.class,
//        basePackages = "kr.co.well_buy.server")
@ComponentScan(basePackages = "com.donghyeon")
//@EnableAutoConfiguration(exclude = SecurityAutoConfiguration.class)
//@EnableJpaAuditing
//@EnableMongoAuditing
//@EnableTransactionManagement
public class TestConfiguration {

}
