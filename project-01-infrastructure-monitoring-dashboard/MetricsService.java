package com.alhanoof.monitoring.service;

import com.alhanoof.monitoring.dto.ServerMetricDTO;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class MetricsService {

    private final Random random =
            new Random();

    public ServerMetricDTO getMetrics() {

        return new ServerMetricDTO(

                30 + random.nextDouble() * 50,

                40 + random.nextDouble() * 40,

                20 + random.nextDouble() * 60,

                "Healthy"
        );
    }
}
