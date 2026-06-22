package com.alhanoof.logmonitor.controller;

import com.alhanoof.logmonitor.dto.LogSummaryDTO;
import com.alhanoof.logmonitor.service.LogService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/logs")
public class LogController {

    private final LogService service;

    public LogController(
            LogService service) {

        this.service = service;
    }

    @GetMapping
    public LogSummaryDTO logs() {

        return service.getLogSummary();
    }
}
