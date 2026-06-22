package com.alhanoof.sre.service;

import com.alhanoof.sre.dto.SreMetricsDTO;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class SreService {

    private final Random random = new Random();

    public SreMetricsDTO getMetrics() {

        double availability =
                99.0 + random.nextDouble();

        double errorRate =
                random.nextDouble();

        double latency =
                100 + random.nextDouble() * 400;

        double errorBudget =
                20 + random.nextDouble() * 80;

        String status =
                availability < 99.95
                        ? "Warning"
                        : "Healthy";

        return new SreMetricsDTO(
                availability,
                errorRate,
                latency,
                errorBudget,
                status
        );
    }
}
