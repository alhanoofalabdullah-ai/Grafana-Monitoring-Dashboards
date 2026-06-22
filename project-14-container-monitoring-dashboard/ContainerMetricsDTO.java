package com.alhanoof.container.dto;

public class ContainerMetricsDTO {

    private int runningContainers;
    private int stoppedContainers;
    private double cpuUsage;
    private double memoryUsage;
    private String status;

    public ContainerMetricsDTO(
            int runningContainers,
            int stoppedContainers,
            double cpuUsage,
            double memoryUsage,
            String status) {

        this.runningContainers = runningContainers;
        this.stoppedContainers = stoppedContainers;
        this.cpuUsage = cpuUsage;
        this.memoryUsage = memoryUsage;
        this.status = status;
    }

    public int getRunningContainers() {
        return runningContainers;
    }

    public int getStoppedContainers() {
        return stoppedContainers;
    }

    public double getCpuUsage() {
        return cpuUsage;
    }

    public double getMemoryUsage() {
        return memoryUsage;
    }

    public String getStatus() {
        return status;
    }
}
