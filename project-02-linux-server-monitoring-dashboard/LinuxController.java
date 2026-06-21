package com.alhanoof.linux.controller;

import com.alhanoof.linux.dto.LinuxMetricDTO;
import com.alhanoof.linux.service.LinuxService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/linux")
public class LinuxController {

    private final LinuxService service;

    public LinuxController(
            LinuxService service) {

        this.service = service;
    }

    @GetMapping
    public LinuxMetricDTO metrics() {

        return service.getMetrics();
    }
}
