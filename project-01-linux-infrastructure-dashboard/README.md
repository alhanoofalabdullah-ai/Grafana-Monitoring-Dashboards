# Project 01 – Linux Infrastructure Dashboard

Enterprise Linux Infrastructure Monitoring Dashboard using Grafana, Prometheus, and Node Exporter.

---

# Overview

This project demonstrates enterprise-grade Linux server monitoring using Grafana dashboards and Prometheus metrics collection.

The dashboard provides real-time visibility into Linux server performance, resource utilization, system health, and operational status.

It is designed for System Administrators, DevOps Engineers, SRE Teams, and Infrastructure Operations Teams.

---

# Business Scenario

Organizations depend on Linux servers to run critical applications and infrastructure services.

Without proper monitoring, infrastructure teams may face:

- High CPU Utilization
- Memory Exhaustion
- Disk Space Shortages
- Network Bottlenecks
- Service Downtime
- Performance Degradation

This dashboard provides centralized monitoring and proactive visibility.

---

# Architecture

Linux Server

↓

Node Exporter

↓

Prometheus

↓

Grafana

↓

Operations Team

---

# Components

## Linux Server

Provides:

- Operating System Metrics
- Resource Utilization
- Performance Data

---

## Node Exporter

Collects:

- CPU Metrics
- Memory Metrics
- Disk Metrics
- Network Metrics
- System Metrics

---

## Prometheus

Responsible for:

- Metrics Collection
- Time-Series Storage
- Query Execution

---

## Grafana

Responsible for:

- Dashboard Visualization
- Reporting
- Performance Analytics

---

# Dashboard Panels

## CPU Monitoring

Displays:

- CPU Utilization
- CPU Load Average
- CPU Core Usage
- CPU Idle Time

---

## Memory Monitoring

Displays:

- Used Memory
- Free Memory
- Memory Utilization %
- Swap Usage

---

## Disk Monitoring

Displays:

- Disk Usage
- Free Disk Space
- Disk Utilization %
- Filesystem Status

---

## Network Monitoring

Displays:

- Network Traffic
- Received Packets
- Sent Packets
- Network Errors

---

## System Monitoring

Displays:

- System Uptime
- Running Processes
- Logged-in Users
- System Load

---

# Monitoring Metrics

## CPU Metrics

- node_cpu_seconds_total
- node_load1
- node_load5
- node_load15

---

## Memory Metrics

- node_memory_MemTotal_bytes
- node_memory_MemAvailable_bytes
- node_memory_SwapTotal_bytes

---

## Disk Metrics

- node_filesystem_size_bytes
- node_filesystem_avail_bytes

---

## Network Metrics

- node_network_receive_bytes_total
- node_network_transmit_bytes_total

---

# Alert Rules

## High CPU Usage

Threshold:

80%

Severity:

Warning

---

## Critical CPU Usage

Threshold:

95%

Severity:

Critical

---

## Low Memory Available

Threshold:

15%

Severity:

Warning

---

## Disk Space Critical

Threshold:

90%

Severity:

Critical

---

## Server Down

Severity:

Critical

---

# Technologies Used

- Grafana
- Prometheus
- Node Exporter
- Docker
- Linux

---

# Skills Demonstrated

- Linux Administration
- Infrastructure Monitoring
- Grafana Dashboard Design
- Prometheus Monitoring
- Alert Configuration
- Observability Fundamentals

---

# Author

Alhanoof Alabdullah
