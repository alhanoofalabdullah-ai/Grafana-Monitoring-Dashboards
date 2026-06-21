CREATE DATABASE IF NOT EXISTS enterprise_monitoring_db;

USE enterprise_monitoring_db;

CREATE TABLE IF NOT EXISTS system_events (
    id INT AUTO_INCREMENT PRIMARY KEY,
    event_name VARCHAR(100),
    event_status VARCHAR(50),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO system_events (event_name, event_status)
VALUES
('Database Started', 'Healthy'),
('Connection Pool Initialized', 'Healthy'),
('Monitoring Enabled', 'Active');
