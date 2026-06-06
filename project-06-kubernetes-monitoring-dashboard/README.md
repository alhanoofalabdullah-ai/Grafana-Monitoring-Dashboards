# Project 06 – Kubernetes Monitoring Dashboard

Enterprise Kubernetes Monitoring Dashboard using Grafana, Prometheus, Kubernetes Metrics Server, Node Exporter, and Kube-State-Metrics.

---

# Overview

This project demonstrates enterprise-grade Kubernetes monitoring and observability.

The dashboard provides real-time visibility into Kubernetes clusters, nodes, pods, deployments, namespaces, services, resource utilization, and cluster health.

The solution is designed for DevOps Engineers, Platform Engineers, SRE Teams, Cloud Engineers, and Kubernetes Administrators.

---

# Business Scenario

Modern organizations deploy applications on Kubernetes clusters.

Without proper monitoring organizations may face:

- Pod Failures
- Node Failures
- Resource Exhaustion
- Deployment Issues
- Service Downtime
- Cluster Instability

This dashboard provides centralized monitoring and operational visibility across Kubernetes environments.

---

# Architecture

Kubernetes Cluster

↓

Metrics Server

↓

Kube-State-Metrics

↓

Prometheus

↓

Grafana

↓

Operations Team

---

# Components

## Kubernetes Cluster

Provides:

- Nodes
- Pods
- Services
- Deployments
- Namespaces

---

## Metrics Server

Collects:

- CPU Usage
- Memory Usage
- Pod Metrics
- Node Metrics

---

## Kube-State-Metrics

Collects:

- Pod Status
- Deployment Status
- Replica Status
- Cluster State

---

## Prometheus

Responsible for:

- Metrics Collection
- Alert Evaluation
- Time-Series Storage

---

## Grafana

Responsible for:

- Dashboard Visualization
- Reporting
- Analytics

---

# Dashboard Panels

## Cluster Overview

Displays:

- Cluster Health
- Running Nodes
- Running Pods
- Deployments

---

## Node Monitoring

Displays:

- Node Status
- CPU Usage
- Memory Usage
- Disk Utilization

---

## Pod Monitoring

Displays:

- Running Pods
- Failed Pods
- Restart Counts
- Pod Availability

---

## Deployment Monitoring

Displays:

- Deployment Status
- Available Replicas
- Desired Replicas
- Failed Deployments

---

## Namespace Monitoring

Displays:

- Namespace Resource Usage
- Namespace Health
- Namespace Activity

---

## Service Monitoring

Displays:

- Service Availability
- Service Health
- Request Metrics

---

# Monitoring Metrics

## Cluster Metrics

- kubernetes_cluster_health
- cluster_nodes_total
- cluster_pods_total

---

## Node Metrics

- node_cpu_seconds_total
- node_memory_MemAvailable_bytes
- node_filesystem_size_bytes

---

## Pod Metrics

- kube_pod_status_phase
- kube_pod_container_status_restarts_total
- kube_pod_container_status_ready

---

## Deployment Metrics

- kube_deployment_status_replicas
- kube_deployment_spec_replicas
- kube_deployment_status_replicas_available

---

# Alert Rules

## Node Down

Severity:

Critical

---

## Pod Crash Loop

Severity:

Critical

---

## High Node CPU Usage

Threshold:

80%

Severity:

Warning

---

## High Node Memory Usage

Threshold:

85%

Severity:

Warning

---

## Deployment Replica Mismatch

Severity:

Critical

---

## Cluster Resource Exhaustion

Severity:

Critical

---

# Technologies Used

- Grafana
- Prometheus
- Kubernetes
- Kube-State-Metrics
- Metrics Server
- Node Exporter
- Docker

---

# Skills Demonstrated

- Kubernetes Monitoring
- Grafana Dashboard Design
- Cluster Observability
- DevOps Monitoring
- SRE Monitoring
- Platform Engineering
- Alert Engineering
- Cloud Operations

---

# Author

Alhanoof Alabdullah
