package com.donghyeon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaAuditing
@EnableJpaRepositories(repositoryFactoryBeanClass = org.springframework.data.jpa.datatables.repository.DataTablesRepositoryFactoryBean.class)
public class WorkerLoginApplication {


    public static void main(String[] args) {
        SpringApplication.run(WorkerLoginApplication.class, args);
    }

}
