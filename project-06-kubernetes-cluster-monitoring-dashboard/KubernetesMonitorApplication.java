package com.alhanoof.k8smonitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KubernetesMonitorApplication {

    public static void main(String[] args) {

        SpringApplication.run(
                KubernetesMonitorApplication.class,
                args
        );
    }
}
