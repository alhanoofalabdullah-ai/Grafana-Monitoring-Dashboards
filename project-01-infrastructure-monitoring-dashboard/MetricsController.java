package com.alhanoof.monitoring.controller;

import com.alhanoof.monitoring.dto.ServerMetricDTO;
import com.alhanoof.monitoring.service.MetricsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/metrics")
public class MetricsController {

    private final MetricsService service;

    public MetricsController(
            MetricsService service) {

        this.service = service;
    }

    @GetMapping
    public ServerMetricDTO getMetrics() {

        return service.getMetrics();
    }
}
