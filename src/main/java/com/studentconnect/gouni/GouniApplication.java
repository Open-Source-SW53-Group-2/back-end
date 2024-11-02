package com.studentconnect.gouni;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.studentconnect.gouni.platform")
@EnableJpaRepositories(basePackages = "com.studentconnect.gouni.platform")
public class GouniApplication {

    public static void main(String[] args) {
        SpringApplication.run(GouniApplication.class, args);
    }
}