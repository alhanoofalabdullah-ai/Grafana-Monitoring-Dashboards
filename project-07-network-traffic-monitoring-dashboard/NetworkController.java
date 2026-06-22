package com.alhanoof.networkmonitor.controller;

import com.alhanoof.networkmonitor.dto.NetworkMetricsDTO;
import com.alhanoof.networkmonitor.service.NetworkService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/network")
public class NetworkController {

    private final NetworkService service;

    public NetworkController(
            NetworkService service) {

        this.service = service;
    }

    @GetMapping
    public NetworkMetricsDTO metrics() {

        return service.getMetrics();
    }
}
