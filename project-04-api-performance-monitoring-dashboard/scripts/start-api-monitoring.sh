#!/bin/bash

echo "Starting API Performance Monitoring Dashboard..."

docker-compose up -d

echo "Grafana: http://localhost:3000"
echo "Prometheus: http://localhost:9090"
echo "API Service: http://localhost:8080/api/metrics"
