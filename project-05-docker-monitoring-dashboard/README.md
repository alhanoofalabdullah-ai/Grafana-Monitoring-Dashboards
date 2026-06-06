# Project 05 – Docker Monitoring Dashboard

Enterprise Docker Monitoring Dashboard using Grafana, Prometheus, cAdvisor, and Node Exporter.

---

# Overview

This project demonstrates enterprise-grade Docker monitoring and container observability.

The dashboard provides real-time visibility into container health, resource utilization, container availability, image usage, host performance, and operational metrics.

The solution is designed for DevOps Engineers, Platform Engineers, SRE Teams, Infrastructure Engineers, and Cloud Operations Teams.

---

# Business Scenario

Organizations use Docker containers to deploy applications quickly and consistently.

Without proper monitoring organizations may face:

- Container Failures
- High Resource Consumption
- Unexpected Restarts
- Performance Degradation
- Host Resource Exhaustion
- Application Downtime

This dashboard provides centralized visibility into Docker environments.

---

# Architecture

Docker Host

↓

cAdvisor

↓

Prometheus

↓

Grafana

↓

Operations Team

---

# Components

## Docker Engine

Provides:

- Container Runtime
- Image Management
- Container Lifecycle

---

## cAdvisor

Collects:

- Container CPU Usage
- Container Memory Usage
- Container Filesystem Usage
- Container Network Metrics

---

## Node Exporter

Collects:

- Docker Host Metrics
- CPU Metrics
- Memory Metrics
- Disk Metrics

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
- Performance Analytics

---

# Dashboard Panels

## Container Health

Displays:

- Running Containers
- Stopped Containers
- Restart Count
- Container Availability

---

## Resource Utilization

Displays:

- CPU Usage
- Memory Usage
- Disk Usage
- Network Usage

---

## Docker Host Monitoring

Displays:

- Host CPU Usage
- Host Memory Usage
- Host Disk Utilization
- System Load

---

## Image Monitoring

Displays:

- Docker Images
- Image Sizes
- Image Utilization
- Unused Images

---

## Container Performance

Displays:

- Container Throughput
- Network Traffic
- Disk I/O
- Response Metrics

---

# Monitoring Metrics

## Container Metrics

- container_cpu_usage_seconds_total
- container_memory_usage_bytes
- container_network_receive_bytes_total
- container_network_transmit_bytes_total

---

## Host Metrics

- node_cpu_seconds_total
- node_memory_MemAvailable_bytes
- node_filesystem_size_bytes

---

## Docker Metrics

- container_start_time_seconds
- container_last_seen
- container_fs_usage_bytes

---

# Alert Rules

## Container Down

Severity:

Critical

---

## High Container CPU Usage

Threshold:

80%

Severity:

Warning

---

## High Container Memory Usage

Threshold:

85%

Severity:

Warning

---

## Container Restart Loop

Threshold:

5 Restarts

Severity:

Critical

---

## Docker Host Resource Exhaustion

Severity:

Critical

---

# Technologies Used

- Grafana
- Prometheus
- Docker
- cAdvisor
- Node Exporter
- Linux

---

# Skills Demonstrated

- Docker Monitoring
- Container Observability
- Grafana Dashboard Design
- Infrastructure Monitoring
- DevOps Monitoring
- Platform Engineering
- Alert Engineering

---

# Author

Alhanoof Alabdullah
