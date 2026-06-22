#!/bin/bash

echo "Starting Microservices Monitoring Dashboard..."

docker-compose up -d

echo "Grafana: http://localhost:3000"

echo "Prometheus: http://localhost:9090"

echo "Monitoring API: http://localhost:8083/api/microservices"
