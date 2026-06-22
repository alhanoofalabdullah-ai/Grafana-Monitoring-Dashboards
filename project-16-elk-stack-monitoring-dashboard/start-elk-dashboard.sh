#!/bin/bash

echo "Starting ELK Monitoring Stack..."

docker-compose up -d

echo "Grafana: http://localhost:3000"

echo "Prometheus: http://localhost:9090"

echo "Kibana: http://localhost:5601"

echo "Elasticsearch: http://localhost:9200"
