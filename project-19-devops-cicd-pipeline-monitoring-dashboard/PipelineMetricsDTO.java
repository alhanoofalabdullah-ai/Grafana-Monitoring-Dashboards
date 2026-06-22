package com.alhanoof.cicd.dto;

public class PipelineMetricsDTO {

    private int successfulBuilds;
    private int failedBuilds;
    private double deploymentSuccessRate;
    private double averageDeploymentTime;
    private String status;

    public PipelineMetricsDTO(
            int successfulBuilds,
            int failedBuilds,
            double deploymentSuccessRate,
            double averageDeploymentTime,
            String status) {

        this.successfulBuilds = successfulBuilds;
        this.failedBuilds = failedBuilds;
        this.deploymentSuccessRate = deploymentSuccessRate;
        this.averageDeploymentTime = averageDeploymentTime;
        this.status = status;
    }

    public int getSuccessfulBuilds() {
        return successfulBuilds;
    }

    public int getFailedBuilds() {
        return failedBuilds;
    }

    public double getDeploymentSuccessRate() {
        return deploymentSuccessRate;
    }

    public double getAverageDeploymentTime() {
        return averageDeploymentTime;
    }

    public String getStatus() {
        return status;
    }
}
