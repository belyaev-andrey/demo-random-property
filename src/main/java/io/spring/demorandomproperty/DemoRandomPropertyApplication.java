package io.spring.demorandomproperty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RandomPropertiesConfig.class)
public class DemoRandomPropertyApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoRandomPropertyApplication.class, args);
    }

}
