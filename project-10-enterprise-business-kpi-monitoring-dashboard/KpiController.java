package com.alhanoof.kpi.controller;

import com.alhanoof.kpi.dto.BusinessKpiDTO;
import com.alhanoof.kpi.service.KpiService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kpi")
public class KpiController {

    private final KpiService service;

    public KpiController(
            KpiService service) {

        this.service = service;
    }

    @GetMapping
    public BusinessKpiDTO getKpis() {

        return service.getKpis();
    }
}
