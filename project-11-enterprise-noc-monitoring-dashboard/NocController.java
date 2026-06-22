package com.alhanoof.noc.controller;

import com.alhanoof.noc.dto.NocMetricsDTO;
import com.alhanoof.noc.service.NocService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/noc")
public class NocController {

    private final NocService service;

    public NocController(NocService service) {
        this.service = service;
    }

    @GetMapping
    public NocMetricsDTO getNocMetrics() {
        return service.getNocMetrics();
    }
}
