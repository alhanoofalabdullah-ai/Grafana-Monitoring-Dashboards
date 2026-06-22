package com.alhanoof.container;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContainerMonitoringApplication {

    public static void main(String[] args) {

        SpringApplication.run(
                ContainerMonitoringApplication.class,
                args
        );
    }
}
