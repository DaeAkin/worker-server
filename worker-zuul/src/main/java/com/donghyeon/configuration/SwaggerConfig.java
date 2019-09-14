package com.donghyeon.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
@Profile("!production")
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("worker_api_v1")
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
//                .paths(PathSelectors.regex("/api/*"))
//                .paths(PathSelectors.ant("/api/**"))
                .build().apiInfo(apiInfo());
    }



    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("zuul Api")
                .description("서비스 게이트웨이 API.")
                .contact(new Contact("민동현", "https://daeakin.github.io/", "mindh890@gmail.com"))
                .version("1.0.0")
                .build();
    }

}
