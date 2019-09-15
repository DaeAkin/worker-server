package com.donghyeon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
//@EnableDiscoveryClient//eureka, consul, zookeeper의 implements를 모두 포함. @EnableEurekaClient는 only works for eureka.
@EnableJpaAuditing
@EnableJpaRepositories(repositoryFactoryBeanClass = org.springframework.data.jpa.datatables.repository.DataTablesRepositoryFactoryBean.class)
//@RibbonClient(name="worker-login", configuration = RibbonAutoConfiguration.class)
//@RefreshScope
public class WorkerGeoApplication {


    public static void main(String[] args) {
        SpringApplication.run(WorkerGeoApplication.class, args);
    }

}
