package com.alhanoof.monitoring.dto;

public class MicroserviceMetricsDTO {

    private int activeServices;
    private int failedServices;
    private double averageResponseTime;
    private double requestRate;
    private String status;

    public MicroserviceMetricsDTO(
            int activeServices,
            int failedServices,
            double averageResponseTime,
            double requestRate,
            String status) {

        this.activeServices = activeServices;
        this.failedServices = failedServices;
        this.averageResponseTime = averageResponseTime;
        this.requestRate = requestRate;
        this.status = status;
    }

    public int getActiveServices() {
        return activeServices;
    }

    public int getFailedServices() {
        return failedServices;
    }

    public double getAverageResponseTime() {
        return averageResponseTime;
    }

    public double getRequestRate() {
        return requestRate;
    }

    public String getStatus() {
        return status;
    }
}
