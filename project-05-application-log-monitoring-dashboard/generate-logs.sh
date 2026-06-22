#!/bin/bash

echo "$(date) INFO User Login" >> logs/application.log

echo "$(date) WARNING CPU Usage High" >> logs/application.log

echo "$(date) ERROR Database Timeout" >> logs/application.log
