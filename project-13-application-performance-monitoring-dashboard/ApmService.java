package com.alhanoof.apm.service;

import com.alhanoof.apm.dto.ApmMetricsDTO;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ApmService {

    private final Random random =
            new Random();

    public ApmMetricsDTO getMetrics() {

        double responseTime =
                100 + random.nextDouble() * 900;

        double throughput =
                500 + random.nextDouble() * 3000;

        double errorRate =
                random.nextDouble() * 5;

        double memoryUsage =
                30 + random.nextDouble() * 60;

        double cpuUsage =
                20 + random.nextDouble() * 70;

        String status =
                errorRate > 3
                        ? "Warning"
                        : "Healthy";

        return new ApmMetricsDTO(
                responseTime,
                throughput,
                errorRate,
                memoryUsage,
                cpuUsage,
                status
        );
    }
}
