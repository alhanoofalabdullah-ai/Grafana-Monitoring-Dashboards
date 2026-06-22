package com.alhanoof.networkmonitor.service;

import com.alhanoof.networkmonitor.dto.NetworkMetricsDTO;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class NetworkService {

    private final Random random =
            new Random();

    public NetworkMetricsDTO getMetrics() {

        double inbound =
                100 + random.nextDouble() * 900;

        double outbound =
                80 + random.nextDouble() * 800;

        double latency =
                5 + random.nextDouble() * 100;

        int connections =
                50 + random.nextInt(500);

        String status =
                latency > 80
                        ? "Warning"
                        : "Healthy";

        return new NetworkMetricsDTO(
                inbound,
                outbound,
                latency,
                connections,
                status
        );
    }
}
