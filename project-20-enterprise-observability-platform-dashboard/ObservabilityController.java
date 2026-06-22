package com.alhanoof.observability.controller;

import com.alhanoof.observability.dto.ObservabilityMetricsDTO;
import com.alhanoof.observability.service.ObservabilityService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/observability")
public class ObservabilityController {

    private final ObservabilityService service;

    public ObservabilityController(
            ObservabilityService service) {
        this.service = service;
    }

    @GetMapping
    public ObservabilityMetricsDTO getMetrics() {
        return service.getMetrics();
    }
}
