package com.alhanoof.monitoring.service;

import com.alhanoof.monitoring.dto.MicroserviceMetricsDTO;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class MonitoringService {

    private final Random random =
            new Random();

    public MicroserviceMetricsDTO getMetrics() {

        int active =
                8 + random.nextInt(20);

        int failed =
                random.nextInt(3);

        double responseTime =
                50 + random.nextDouble() * 400;

        double requestRate =
                100 + random.nextDouble() * 3000;

        String status =
                failed > 1
                        ? "Degraded"
                        : "Healthy";

        return new MicroserviceMetricsDTO(
                active,
                failed,
                responseTime,
                requestRate,
                status
        );
    }
}
