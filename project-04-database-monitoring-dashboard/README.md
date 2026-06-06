# Project 04 – Database Monitoring Dashboard

Enterprise Database Monitoring Dashboard using Grafana, Prometheus, MySQL Exporter, PostgreSQL Exporter, and SQL Server Exporter.

---

# Overview

This project demonstrates enterprise-grade database monitoring and observability.

The dashboard provides real-time visibility into database health, performance, connections, query execution, storage utilization, and availability.

The solution is designed for Database Administrators (DBAs), Infrastructure Teams, DevOps Engineers, SRE Teams, and Operations Teams.

---

# Business Scenario

Enterprise applications depend heavily on databases.

Without proper monitoring organizations may face:

- Database Downtime
- Slow Queries
- Connection Exhaustion
- Storage Issues
- High Resource Utilization
- Application Performance Problems

This dashboard provides proactive visibility into database performance and operational health.

---

# Architecture

Database Server

↓

Database Exporter

↓

Prometheus

↓

Grafana

↓

Database Operations Team

---

# Supported Databases

## MySQL

Monitor:

- Connections
- Query Performance
- Replication
- Storage Usage

---

## PostgreSQL

Monitor:

- Active Sessions
- Query Statistics
- Locks
- Database Availability

---

## SQL Server

Monitor:

- Transactions
- Performance Counters
- Database Health
- Resource Utilization

---

# Dashboard Panels

## Database Availability

Displays:

- Database Status
- Uptime
- Availability %
- Health Score

---

## Connection Monitoring

Displays:

- Active Connections
- Maximum Connections
- Connection Utilization
- Connection Failures

---

## Query Performance

Displays:

- Query Duration
- Query Throughput
- Slow Queries
- Top Queries

---

## Storage Monitoring

Displays:

- Database Size
- Free Space
- Growth Trends
- Storage Utilization

---

## Resource Monitoring

Displays:

- CPU Usage
- Memory Usage
- Disk I/O
- Transaction Activity

---

# Monitoring Metrics

## Availability Metrics

- Database Status
- Uptime
- Health Score

---

## Connection Metrics

- Active Connections
- Failed Connections
- Connection Utilization

---

## Query Metrics

- Query Count
- Query Duration
- Slow Query Count

---

## Storage Metrics

- Database Size
- Storage Growth
- Free Disk Space

---

# Alert Rules

## Database Down

Severity:

Critical

---

## High Connection Usage

Threshold:

80%

Severity:

Warning

---

## Slow Queries Detected

Threshold:

5 Seconds

Severity:

Warning

---

## Storage Critical

Threshold:

90%

Severity:

Critical

---

## High Query Latency

Severity:

Critical

---

# Technologies Used

- Grafana
- Prometheus
- MySQL Exporter
- PostgreSQL Exporter
- SQL Server Exporter
- Docker
- Linux

---

# Skills Demonstrated

- Database Monitoring
- Query Performance Analysis
- Grafana Dashboard Design
- Database Administration
- Infrastructure Monitoring
- Alert Engineering
- Observability Engineering

---

# Author

Alhanoof Alabdullah
