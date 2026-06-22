package com.alhanoof.k8smonitor.controller;

import com.alhanoof.k8smonitor.dto.ClusterMetricsDTO;
import com.alhanoof.k8smonitor.service.ClusterService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cluster")
public class ClusterController {

    private final ClusterService service;

    public ClusterController(
            ClusterService service) {

        this.service = service;
    }

    @GetMapping
    public ClusterMetricsDTO clusterMetrics() {

        return service.getClusterMetrics();
    }
}
