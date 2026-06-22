package com.alhanoof.k8smonitor.service;

import com.alhanoof.k8smonitor.dto.ClusterMetricsDTO;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ClusterService {

    private final Random random =
            new Random();

    public ClusterMetricsDTO getClusterMetrics() {

        int nodes =
                3 + random.nextInt(10);

        int pods =
                50 + random.nextInt(300);

        double cpu =
                20 + random.nextDouble() * 70;

        double memory =
                25 + random.nextDouble() * 65;

        String status =
                cpu > 85
                        ? "Warning"
                        : "Healthy";

        return new ClusterMetricsDTO(
                nodes,
                pods,
                cpu,
                memory,
                status
        );
    }
}
