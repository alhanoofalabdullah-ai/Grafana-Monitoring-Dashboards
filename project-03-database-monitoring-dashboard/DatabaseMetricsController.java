package com.alhanoof.databasemonitor.controller;

import com.alhanoof.databasemonitor.dto.DatabaseMetricDTO;
import com.alhanoof.databasemonitor.service.DatabaseMetricsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/database-metrics")
public class DatabaseMetricsController {

    private final DatabaseMetricsService service;

    public DatabaseMetricsController(DatabaseMetricsService service) {
        this.service = service;
    }

    @GetMapping
    public DatabaseMetricDTO getDatabaseMetrics() {
        return service.getDatabaseMetrics();
    }
}
