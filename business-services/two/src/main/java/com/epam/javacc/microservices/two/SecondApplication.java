package com.epam.javacc.microservices.two;

import com.epam.javacc.microservices.common.config.PropertyReader;
import com.epam.javacc.microservices.common.config.PropertyReaderImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.ManagementWebSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class, ManagementWebSecurityAutoConfiguration.class})
@EnableEurekaClient
@EnableFeignClients
public class SecondApplication {

    private static final String TEST = "test";

    public static void main(String[] args) {
        SpringApplication.run(SecondApplication.class, args);
    }

    @Bean
    PropertyReader propertyReader() {
        PropertyReader reader = new PropertyReaderImpl(TEST);
        System.out.println("!Property is " + reader.getStringProperty(TEST) + " !");
        return reader;
    }


}
