package com.donghyeon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;


@SpringBootApplication
@EnableEurekaClient
@EnableJpaAuditing
@EnableJpaRepositories(repositoryFactoryBeanClass = org.springframework.data.jpa.datatables.repository.DataTablesRepositoryFactoryBean.class)
public class WorkerLoginApplication {


    public static void main(String[] args) {
        SpringApplication.run(WorkerLoginApplication.class, args);
    }

}
