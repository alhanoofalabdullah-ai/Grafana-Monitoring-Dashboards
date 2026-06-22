#!/bin/bash

echo "Starting SLA Monitoring Dashboard..."

docker-compose up -d

echo "Grafana: http://localhost:3000"
echo "Prometheus: http://localhost:9090"
echo "SLA API: http://localhost:8080/api/sla"
