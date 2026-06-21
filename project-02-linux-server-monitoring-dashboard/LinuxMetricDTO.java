package com.alhanoof.linux.dto;

public class LinuxMetricDTO {

    private double cpuUsage;
    private double memoryUsage;
    private double diskUsage;
    private String status;

    public LinuxMetricDTO(
            double cpuUsage,
            double memoryUsage,
            double diskUsage,
            String status) {

        this.cpuUsage = cpuUsage;
        this.memoryUsage = memoryUsage;
        this.diskUsage = diskUsage;
        this.status = status;
    }

    public double getCpuUsage() {
        return cpuUsage;
    }

    public double getMemoryUsage() {
        return memoryUsage;
    }

    public double getDiskUsage() {
        return diskUsage;
    }

    public String getStatus() {
        return status;
    }
}
