package com.alhanoof.incident.controller;

import com.alhanoof.incident.dto.IncidentMetricsDTO;
import com.alhanoof.incident.service.IncidentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/incidents")
public class IncidentController {

    private final IncidentService service;

    public IncidentController(IncidentService service) {
        this.service = service;
    }

    @GetMapping
    public IncidentMetricsDTO getIncidentMetrics() {
        return service.getIncidentMetrics();
    }
}
