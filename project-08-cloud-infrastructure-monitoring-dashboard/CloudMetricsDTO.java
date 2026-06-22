package com.alhanoof.cloudmonitor.dto;

public class CloudMetricsDTO {

    private int virtualMachines;
    private int storageVolumes;
    private double cpuUsage;
    private double memoryUsage;
    private String status;

    public CloudMetricsDTO(
            int virtualMachines,
            int storageVolumes,
            double cpuUsage,
            double memoryUsage,
            String status) {

        this.virtualMachines = virtualMachines;
        this.storageVolumes = storageVolumes;
        this.cpuUsage = cpuUsage;
        this.memoryUsage = memoryUsage;
        this.status = status;
    }

    public int getVirtualMachines() {
        return virtualMachines;
    }

    public int getStorageVolumes() {
        return storageVolumes;
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
