package com.alhanoof.incident.service;

import com.alhanoof.incident.dto.IncidentMetricsDTO;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class IncidentService {

    private final Random random = new Random();

    public IncidentMetricsDTO getIncidentMetrics() {

        int open = random.nextInt(60);
        int closed = 100 + random.nextInt(500);
        int critical = random.nextInt(15);
        double mttr = 1 + random.nextDouble() * 24;

        String status = critical > 8 ? "Critical" : "Stable";

        return new IncidentMetricsDTO(
                open,
                closed,
                critical,
                mttr,
                status
        );
    }
}
