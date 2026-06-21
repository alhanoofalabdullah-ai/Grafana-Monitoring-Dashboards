#!/bin/bash

echo "Starting Enterprise Monitoring Center..."

docker-compose up -d

echo "Grafana Running..."
echo "Prometheus Running..."
echo "Monitoring API Running..."
