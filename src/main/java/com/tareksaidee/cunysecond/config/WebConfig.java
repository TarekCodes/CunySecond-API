package com.tareksaidee.cunysecond.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class WebConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.tareksaidee.cunysecond"))
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "CunySecond's API",
                "Allows you to retrieve data from our cloud database!",
                "1.0",
                "Terms of service",
                new Contact("Tarek Saidee", "http://github.com/ts96", "tareksaidee@outlook.com"),
                "Open Source!!", "  ", Collections.emptyList());
    }
}
