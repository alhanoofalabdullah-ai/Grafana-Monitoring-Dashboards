package com.alhanoof.elk.service;

import com.alhanoof.elk.dto.ElkMetricsDTO;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ElkService {

    private final Random random =
            new Random();

    public ElkMetricsDTO getMetrics() {

        int indexed =
                10000 + random.nextInt(50000);

        int errors =
                random.nextInt(500);

        int warnings =
                random.nextInt(1000);

        double ingestion =
                100 + random.nextDouble() * 900;

        String status =
                errors > 300
                        ? "Critical"
                        : "Healthy";

        return new ElkMetricsDTO(
                indexed,
                errors,
                warnings,
                ingestion,
                status
        );
    }
}
