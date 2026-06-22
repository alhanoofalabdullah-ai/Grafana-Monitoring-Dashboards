package com.alhanoof.noc.service;

import com.alhanoof.noc.dto.NocMetricsDTO;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class NocService {

    private final Random random = new Random();

    public NocMetricsDTO getNocMetrics() {

        int monitoredServices = 50 + random.nextInt(150);
        int activeIncidents = random.nextInt(20);
        double uptime = 95 + random.nextDouble() * 5;
        int criticalAlerts = random.nextInt(10);

        String status = criticalAlerts > 5 ? "Critical" : "Operational";

        return new NocMetricsDTO(
                monitoredServices,
                activeIncidents,
                uptime,
                criticalAlerts,
                status
        );
    }
}
