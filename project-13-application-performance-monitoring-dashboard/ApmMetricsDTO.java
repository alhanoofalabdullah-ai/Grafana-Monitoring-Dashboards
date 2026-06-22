package com.alhanoof.apm.dto;

public class ApmMetricsDTO {

    private double responseTime;
    private double throughput;
    private double errorRate;
    private double memoryUsage;
    private double cpuUsage;
    private String status;

    public ApmMetricsDTO(
            double responseTime,
            double throughput,
            double errorRate,
            double memoryUsage,
            double cpuUsage,
            String status) {

        this.responseTime = responseTime;
        this.throughput = throughput;
        this.errorRate = errorRate;
        this.memoryUsage = memoryUsage;
        this.cpuUsage = cpuUsage;
        this.status = status;
    }

    public double getResponseTime() {
        return responseTime;
    }

    public double getThroughput() {
        return throughput;
    }

    public double getErrorRate() {
        return errorRate;
    }

    public double getMemoryUsage() {
        return memoryUsage;
    }

    public double getCpuUsage() {
        return cpuUsage;
    }

    public String getStatus() {
        return status;
    }
}
