package com.alhanoof.linux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LinuxMonitoringApplication {

    public static void main(String[] args) {

        SpringApplication.run(
                LinuxMonitoringApplication.class,
                args
        );
    }
}
