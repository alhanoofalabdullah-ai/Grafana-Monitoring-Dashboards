package com.alhanoof.kpi.service;

import com.alhanoof.kpi.dto.BusinessKpiDTO;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class KpiService {

    private final Random random =
            new Random();

    public BusinessKpiDTO getKpis() {

        double revenue =
                500000 + random.nextDouble() * 500000;

        double completionRate =
                70 + random.nextDouble() * 30;

        double slaCompliance =
                85 + random.nextDouble() * 15;

        double customerSatisfaction =
                80 + random.nextDouble() * 20;

        String status =
                completionRate > 85
                        ? "Excellent"
                        : "Needs Improvement";

        return new BusinessKpiDTO(
                revenue,
                completionRate,
                slaCompliance,
                customerSatisfaction,
                status
        );
    }
}
