package com.alhanoof.elk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElkMonitoringApplication {

    public static void main(String[] args) {

        SpringApplication.run(
                ElkMonitoringApplication.class,
                args
        );
    }
}
