package com.alhanoof.container.controller;

import com.alhanoof.container.dto.ContainerMetricsDTO;
import com.alhanoof.container.service.ContainerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/containers")
public class ContainerController {

    private final ContainerService service;

    public ContainerController(
            ContainerService service) {

        this.service = service;
    }

    @GetMapping
    public ContainerMetricsDTO metrics() {

        return service.getMetrics();
    }
}
