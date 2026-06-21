package com.alhanoof.monitoring.dto;

public class ServerMetricDTO {

    private Double cpuUsage;
    private Double memoryUsage;
    private Double diskUsage;
    private String status;

    public ServerMetricDTO(
            Double cpuUsage,
            Double memoryUsage,
            Double diskUsage,
            String status) {

        this.cpuUsage = cpuUsage;
        this.memoryUsage = memoryUsage;
        this.diskUsage = diskUsage;
        this.status = status;
    }

    public Double getCpuUsage() {
        return cpuUsage;
    }

    public Double getMemoryUsage() {
        return memoryUsage;
    }

    public Double getDiskUsage() {
        return diskUsage;
    }

    public String getStatus() {
        return status;
    }
}
