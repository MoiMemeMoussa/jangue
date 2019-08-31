package sn.daara.jangue.jangue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"sn.daara.jangue.jangue.model"})  // scan JPA entities
public class JangueApplication {

    public static void main(String[] args) {
        SpringApplication.run(JangueApplication.class, args);
    }

}
