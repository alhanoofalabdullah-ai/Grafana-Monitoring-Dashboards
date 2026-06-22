package com.alhanoof.cicd.service;

import com.alhanoof.cicd.dto.PipelineMetricsDTO;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class PipelineService {

    private final Random random = new Random();

    public PipelineMetricsDTO getMetrics() {

        int successfulBuilds =
                500 + random.nextInt(1000);

        int failedBuilds =
                random.nextInt(50);

        double deploymentSuccessRate =
                90 + random.nextDouble() * 10;

        double averageDeploymentTime =
                2 + random.nextDouble() * 8;

        String status =
                deploymentSuccessRate < 95
                        ? "Warning"
                        : "Healthy";

        return new PipelineMetricsDTO(
                successfulBuilds,
                failedBuilds,
                deploymentSuccessRate,
                averageDeploymentTime,
                status
        );
    }
}
