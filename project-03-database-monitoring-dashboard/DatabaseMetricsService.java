package com.alhanoof.databasemonitor.service;

import com.alhanoof.databasemonitor.dto.DatabaseMetricDTO;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class DatabaseMetricsService {

    private final Random random = new Random();

    public DatabaseMetricDTO getDatabaseMetrics() {
        int activeConnections = 10 + random.nextInt(90);
        int totalQueries = 1000 + random.nextInt(9000);
        double storageUsage = 35 + random.nextDouble() * 55;

        String status = storageUsage > 85 ? "Warning" : "Healthy";

        return new DatabaseMetricDTO(
                activeConnections,
                totalQueries,
                storageUsage,
                status
        );
    }
}
