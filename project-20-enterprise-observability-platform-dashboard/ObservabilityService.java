package com.alhanoof.observability.service;

import com.alhanoof.observability.dto.ObservabilityMetricsDTO;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ObservabilityService {

    private final Random random = new Random();

    public ObservabilityMetricsDTO getMetrics() {

        return new ObservabilityMetricsDTO(
                99.90 + random.nextDouble() * 0.09,
                random.nextDouble(),
                100 + random.nextDouble() * 300,
                random.nextInt(5),
                70 + random.nextDouble() * 30,
                "Healthy"
        );
    }
}
