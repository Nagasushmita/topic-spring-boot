package io.javabrains.springbootstarter;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
@EntityScan(basePackages ="io.javabrains.springbootstarter")
public class CourseApiApp {
    public static void main(String[] args) {
        SpringApplication.run(CourseApiApp.class,args);


    }
}
