package com.alhanoof.cloudmonitor.controller;

import com.alhanoof.cloudmonitor.dto.CloudMetricsDTO;
import com.alhanoof.cloudmonitor.service.CloudService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cloud")
public class CloudController {

    private final CloudService service;

    public CloudController(
            CloudService service) {

        this.service = service;
    }

    @GetMapping
    public CloudMetricsDTO metrics() {

        return service.getMetrics();
    }
}
