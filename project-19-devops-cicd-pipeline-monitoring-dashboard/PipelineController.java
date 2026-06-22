package com.alhanoof.cicd.controller;

import com.alhanoof.cicd.dto.PipelineMetricsDTO;
import com.alhanoof.cicd.service.PipelineService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pipeline")
public class PipelineController {

    private final PipelineService service;

    public PipelineController(PipelineService service) {
        this.service = service;
    }

    @GetMapping
    public PipelineMetricsDTO getMetrics() {
        return service.getMetrics();
    }
}
