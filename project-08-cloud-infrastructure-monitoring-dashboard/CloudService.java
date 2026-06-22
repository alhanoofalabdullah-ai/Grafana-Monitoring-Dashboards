package com.alhanoof.cloudmonitor.service;

import com.alhanoof.cloudmonitor.dto.CloudMetricsDTO;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class CloudService {

    private final Random random =
            new Random();

    public CloudMetricsDTO getMetrics() {

        int vms =
                10 + random.nextInt(50);

        int storage =
                20 + random.nextInt(100);

        double cpu =
                20 + random.nextDouble() * 70;

        double memory =
                25 + random.nextDouble() * 65;

        String status =
                cpu > 85
                        ? "Warning"
                        : "Healthy";

        return new CloudMetricsDTO(
                vms,
                storage,
                cpu,
                memory,
                status
        );
    }
}
