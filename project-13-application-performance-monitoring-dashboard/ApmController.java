package com.alhanoof.apm.controller;

import com.alhanoof.apm.dto.ApmMetricsDTO;
import com.alhanoof.apm.service.ApmService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/apm")
public class ApmController {

    private final ApmService service;

    public ApmController(
            ApmService service) {

        this.service = service;
    }

    @GetMapping
    public ApmMetricsDTO metrics() {

        return service.getMetrics();
    }
}
