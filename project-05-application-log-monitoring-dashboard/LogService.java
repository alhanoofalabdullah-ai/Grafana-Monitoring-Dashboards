package com.alhanoof.logmonitor.service;

import com.alhanoof.logmonitor.dto.LogSummaryDTO;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class LogService {

    private final Random random =
            new Random();

    public LogSummaryDTO getLogSummary() {

        int totalLogs =
                5000 + random.nextInt(5000);

        int errorLogs =
                random.nextInt(100);

        int warningLogs =
                random.nextInt(300);

        String status =
                errorLogs > 50
                        ? "Critical"
                        : "Healthy";

        return new LogSummaryDTO(
                totalLogs,
                errorLogs,
                warningLogs,
                status
        );
    }
}
