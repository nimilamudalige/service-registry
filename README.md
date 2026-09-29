# PulseFit — Service Registry

## Project Description

The Eureka Service Registry for the PulseFit platform. Every microservice
(`member-service`, `class-service`, `booking-service`) and the `api-gateway`
register here on startup and use it to discover one another by logical
service name instead of hardcoded host:port pairs, so the Gateway keeps
working automatically as microservice instances scale up or down.

## Technology Stack

- Java 25
- Spring Boot 4.0.8
- Spring Cloud 2025.1.3 — Netflix Eureka Server
- PM2 (process management on the deployed VM)

## API

The Eureka dashboard is served at `/` on port `8761` (no REST API of its own
beyond the standard Eureka registry endpoints under `/eureka/**`).

## Setup / Getting Started

### Prerequisites

- Java 25 JDK, Maven 3.9+

### Run locally

```bash
mvn clean package
java -jar target/service-registry.jar
```

Then open `http://localhost:8761` to see the dashboard.

### Run with PM2 (as on the deployed VM)

```bash
mvn clean package
cp target/service-registry.jar /opt/pulsefit/service-registry/service-registry.jar
cd /opt/pulsefit/service-registry
pm2 start ecosystem.config.js
pm2 save
```

See `deployment/GCP_CLI_DEPLOYMENT_GUIDE.md` (in the parent workspace, not
part of this repo) for the full GCP deployment walkthrough.

## Student Information

- **Student Name:** Pasan Nimila
- **Student Number:** 2301692034
- **Slack Handle:** pasan_nimila
- **GCP Project ID:** pulsefit-capstone
