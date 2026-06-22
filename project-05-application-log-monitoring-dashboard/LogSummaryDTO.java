package com.alhanoof.logmonitor.dto;

public class LogSummaryDTO {

    private int totalLogs;
    private int errorLogs;
    private int warningLogs;
    private String status;

    public LogSummaryDTO(
            int totalLogs,
            int errorLogs,
            int warningLogs,
            String status) {

        this.totalLogs = totalLogs;
        this.errorLogs = errorLogs;
        this.warningLogs = warningLogs;
        this.status = status;
    }

    public int getTotalLogs() {
        return totalLogs;
    }

    public int getErrorLogs() {
        return errorLogs;
    }

    public int getWarningLogs() {
        return warningLogs;
    }

    public String getStatus() {
        return status;
    }
}
