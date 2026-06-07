# Project 07 – Cloud Infrastructure Dashboard

Enterprise Multi-Cloud Infrastructure Monitoring Dashboard using Grafana, Prometheus, AWS CloudWatch, Azure Monitor, and Google Cloud Monitoring.

---

# Overview

This project demonstrates enterprise-grade cloud infrastructure monitoring across AWS, Microsoft Azure, and Google Cloud Platform (GCP).

The dashboard provides centralized visibility into cloud resources, service availability, infrastructure utilization, operational health, and cloud costs.

The solution is designed for Cloud Engineers, DevOps Teams, Platform Engineers, SRE Teams, and Cloud Operations Centers.

---

# Business Scenario

Modern organizations increasingly operate across multiple cloud providers.

Without centralized monitoring organizations may face:

- Cloud Service Failures
- Resource Exhaustion
- Cost Overruns
- Availability Issues
- Capacity Planning Challenges
- Operational Blind Spots

This dashboard provides a single pane of glass for cloud operations.

---

# Architecture

AWS Cloud

Azure Cloud

Google Cloud Platform

↓

Cloud Exporters

↓

Prometheus

↓

Grafana

↓

Cloud Operations Team

---

# Components

## AWS Monitoring

Provides:

- EC2 Monitoring
- RDS Monitoring
- EKS Monitoring
- Load Balancer Monitoring
- Lambda Monitoring

---

## Azure Monitoring

Provides:

- Virtual Machines
- Azure SQL
- AKS Monitoring
- Storage Accounts
- Application Services

---

## Google Cloud Monitoring

Provides:

- Compute Engine
- Cloud SQL
- GKE Monitoring
- Cloud Storage
- Cloud Functions

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

## Multi-Cloud Overview

Displays:

- Total Cloud Resources
- Availability Status
- Active Services
- Health Score

---

## AWS Dashboard

Displays:

- EC2 Utilization
- RDS Health
- EKS Cluster Health
- AWS Availability

---

## Azure Dashboard

Displays:

- VM Health
- Azure SQL Performance
- AKS Health
- Resource Utilization

---

## GCP Dashboard

Displays:

- Compute Engine Status
- Cloud SQL Performance
- GKE Health
- Service Availability

---

## Cloud Cost Dashboard

Displays:

- Cloud Spending
- Monthly Cost Trends
- Resource Costs
- Budget Utilization

---

# Monitoring Metrics

## Compute Metrics

- CPU Usage
- Memory Usage
- Instance Availability

---

## Storage Metrics

- Storage Utilization
- Storage Growth
- Storage Availability

---

## Database Metrics

- Database Connections
- Database Latency
- Database Availability

---

## Network Metrics

- Bandwidth Usage
- Network Throughput
- Latency

---

# Alert Rules

## Cloud Service Down

Severity:

Critical

---

## High Resource Usage

Threshold:

80%

Severity:

Warning

---

## High Cloud Costs

Threshold:

90% Budget

Severity:

Warning

---

## Database Unavailable

Severity:

Critical

---

## Storage Capacity Critical

Severity:

Critical

---

# Technologies Used

- Grafana
- Prometheus
- AWS CloudWatch
- Azure Monitor
- Google Cloud Monitoring
- Docker

---

# Skills Demonstrated

- Cloud Monitoring
- Multi-Cloud Operations
- Grafana Dashboard Design
- Infrastructure Monitoring
- Cloud Cost Management
- Observability Engineering
- Platform Engineering
- Cloud Operations

---

# Author

Alhanoof Alabdullah
