package com.alhanoof.sre.dto;

public class SreMetricsDTO {

    private double availability;
    private double errorRate;
    private double latency;
    private double errorBudgetRemaining;
    private String status;

    public SreMetricsDTO(
            double availability,
            double errorRate,
            double latency,
            double errorBudgetRemaining,
            String status) {

        this.availability = availability;
        this.errorRate = errorRate;
        this.latency = latency;
        this.errorBudgetRemaining = errorBudgetRemaining;
        this.status = status;
    }

    public double getAvailability() {
        return availability;
    }

    public double getErrorRate() {
        return errorRate;
    }

    public double getLatency() {
        return latency;
    }

    public double getErrorBudgetRemaining() {
        return errorBudgetRemaining;
    }

    public String getStatus() {
        return status;
    }
}
