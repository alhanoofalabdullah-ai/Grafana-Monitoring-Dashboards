package com.alhanoof.k8smonitor.dto;

public class ClusterMetricsDTO {

    private int totalNodes;
    private int totalPods;
    private double cpuUsage;
    private double memoryUsage;
    private String clusterStatus;

    public ClusterMetricsDTO(
            int totalNodes,
            int totalPods,
            double cpuUsage,
            double memoryUsage,
            String clusterStatus) {

        this.totalNodes = totalNodes;
        this.totalPods = totalPods;
        this.cpuUsage = cpuUsage;
        this.memoryUsage = memoryUsage;
        this.clusterStatus = clusterStatus;
    }

    public int getTotalNodes() {
        return totalNodes;
    }

    public int getTotalPods() {
        return totalPods;
    }

    public double getCpuUsage() {
        return cpuUsage;
    }

    public double getMemoryUsage() {
        return memoryUsage;
    }

    public String getClusterStatus() {
        return clusterStatus;
    }
}
