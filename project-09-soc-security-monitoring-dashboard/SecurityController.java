package com.alhanoof.socmonitor.controller;

import com.alhanoof.socmonitor.dto.SecurityMetricsDTO;
import com.alhanoof.socmonitor.service.SecurityService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/security")
public class SecurityController {

    private final SecurityService service;

    public SecurityController(
            SecurityService service) {

        this.service = service;
    }

    @GetMapping
    public SecurityMetricsDTO metrics() {

        return service.getMetrics();
    }
}
