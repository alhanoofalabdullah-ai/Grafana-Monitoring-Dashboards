package com.alhanoof.sre.controller;

import com.alhanoof.sre.dto.SreMetricsDTO;
import com.alhanoof.sre.service.SreService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sre")
public class SreController {

    private final SreService service;

    public SreController(SreService service) {
        this.service = service;
    }

    @GetMapping
    public SreMetricsDTO metrics() {
        return service.getMetrics();
    }
}
