package com.alhanoof.apimonitor.service;

import com.alhanoof.apimonitor.dto.ApiMetricDTO;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ApiMetricsService {

    private final Random random = new Random();

    public ApiMetricDTO getApiMetrics() {

        int totalRequests = 1000 + random.nextInt(9000);
        int failedRequests = random.nextInt(200);
        int successfulRequests = totalRequests - failedRequests;
        double averageResponseTime = 100 + random.nextDouble() * 900;

        String status =
                failedRequests > 150 || averageResponseTime > 800
                        ? "Warning"
                        : "Healthy";

        return new ApiMetricDTO(
                totalRequests,
                successfulRequests,
                failedRequests,
                averageResponseTime,
                status
        );
    }
}
