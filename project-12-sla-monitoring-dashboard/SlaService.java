package com.alhanoof.sla.service;

import com.alhanoof.sla.dto.SlaMetricsDTO;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class SlaService {

    private final Random random = new Random();

    public SlaMetricsDTO getSlaMetrics() {

        double slaCompliance = 85 + random.nextDouble() * 15;
        double serviceAvailability = 95 + random.nextDouble() * 5;
        int breachedTickets = random.nextInt(25);
        double averageResponseTime = 5 + random.nextDouble() * 60;
        double averageResolutionTime = 2 + random.nextDouble() * 24;

        String status =
                slaCompliance < 90 || breachedTickets > 15
                        ? "At Risk"
                        : "Compliant";

        return new SlaMetricsDTO(
                slaCompliance,
                serviceAvailability,
                breachedTickets,
                averageResponseTime,
                averageResolutionTime,
                status
        );
    }
}
