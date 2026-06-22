package com.alhanoof.apimonitor.controller;

import com.alhanoof.apimonitor.dto.ApiMetricDTO;
import com.alhanoof.apimonitor.service.ApiMetricsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/metrics")
public class ApiMetricsController {

    private final ApiMetricsService service;

    public ApiMetricsController(ApiMetricsService service) {
        this.service = service;
    }

    @GetMapping
    public ApiMetricDTO getMetrics() {
        return service.getApiMetrics();
    }

    @GetMapping("/health")
    public String health() {
        return "API monitoring service is running";
    }
}
