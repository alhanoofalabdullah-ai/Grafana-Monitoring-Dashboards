#!/bin/bash

echo "Starting Container Monitoring Dashboard..."

docker-compose up -d

echo "Grafana: http://localhost:3000"

echo "Prometheus: http://localhost:9090"

echo "Container API: http://localhost:8080/api/containers"

echo "cAdvisor: http://localhost:8081"
