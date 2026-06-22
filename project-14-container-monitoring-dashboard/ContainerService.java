package com.alhanoof.container.service;

import com.alhanoof.container.dto.ContainerMetricsDTO;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ContainerService {

    private final Random random =
            new Random();

    public ContainerMetricsDTO getMetrics() {

        int running =
                10 + random.nextInt(50);

        int stopped =
                random.nextInt(10);

        double cpu =
                20 + random.nextDouble() * 70;

        double memory =
                25 + random.nextDouble() * 65;

        String status =
                cpu > 85
                        ? "Warning"
                        : "Healthy";

        return new ContainerMetricsDTO(
                running,
                stopped,
                cpu,
                memory,
                status
        );
    }
}
