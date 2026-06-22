package com.alhanoof.monitoring.controller;

import com.alhanoof.monitoring.dto.MicroserviceMetricsDTO;
import com.alhanoof.monitoring.service.MonitoringService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/microservices")
public class MonitoringController {

    private final MonitoringService service;

    public MonitoringController(
            MonitoringService service) {

        this.service = service;
    }

    @GetMapping
    public MicroserviceMetricsDTO metrics() {

        return service.getMetrics();
    }
}
