package com.alhanoof.socmonitor.service;

import com.alhanoof.socmonitor.dto.SecurityMetricsDTO;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class SecurityService {

    private final Random random =
            new Random();

    public SecurityMetricsDTO getMetrics() {

        int events =
                1000 + random.nextInt(10000);

        int failedLogins =
                random.nextInt(500);

        int threats =
                random.nextInt(50);

        int critical =
                random.nextInt(20);

        String status =
                critical > 10
                        ? "Critical"
                        : "Secure";

        return new SecurityMetricsDTO(
                events,
                failedLogins,
                threats,
                critical,
                status
        );
    }
}
