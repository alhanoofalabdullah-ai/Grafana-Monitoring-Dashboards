package com.alhanoof.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CicdMonitoringApplication {

    public static void main(String[] args) {
        SpringApplication.run(
                CicdMonitoringApplication.class,
                args
        );
    }
}
