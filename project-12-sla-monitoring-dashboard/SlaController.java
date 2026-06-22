package com.alhanoof.sla.controller;

import com.alhanoof.sla.dto.SlaMetricsDTO;
import com.alhanoof.sla.service.SlaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sla")
public class SlaController {

    private final SlaService service;

    public SlaController(SlaService service) {
        this.service = service;
    }

    @GetMapping
    public SlaMetricsDTO getSlaMetrics() {
        return service.getSlaMetrics();
    }
}
