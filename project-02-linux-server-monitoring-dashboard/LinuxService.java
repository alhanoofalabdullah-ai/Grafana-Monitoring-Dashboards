package com.alhanoof.linux.service;

import com.alhanoof.linux.dto.LinuxMetricDTO;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class LinuxService {

    private final Random random =
            new Random();

    public LinuxMetricDTO getMetrics() {

        double cpu =
                20 + random.nextDouble() * 60;

        double memory =
                25 + random.nextDouble() * 50;

        double disk =
                15 + random.nextDouble() * 70;

        String status =
                cpu > 85
                        ? "Warning"
                        : "Healthy";

        return new LinuxMetricDTO(
                cpu,
                memory,
                disk,
                status
        );
    }
}
