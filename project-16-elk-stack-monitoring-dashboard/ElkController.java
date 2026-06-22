package com.alhanoof.elk.controller;

import com.alhanoof.elk.dto.ElkMetricsDTO;
import com.alhanoof.elk.service.ElkService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/elk")
public class ElkController {

    private final ElkService service;

    public ElkController(
            ElkService service) {

        this.service = service;
    }

    @GetMapping
    public ElkMetricsDTO metrics() {

        return service.getMetrics();
    }
}
