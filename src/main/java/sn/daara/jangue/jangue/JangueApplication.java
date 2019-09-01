package sn.daara.jangue.jangue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
//@EntityScan(basePackages = {"sn.daara.jangue.jangue.model","sn.daara.jangue.jangue.repository","sn.daara.jangue.jangue.controller"})  // scan JPA entities
public class JangueApplication {
    public static void main(String[] args) {
        SpringApplication.run(JangueApplication.class, args);

    }

}
