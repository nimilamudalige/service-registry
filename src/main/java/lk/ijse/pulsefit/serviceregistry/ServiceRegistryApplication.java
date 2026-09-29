package lk.ijse.pulsefit.serviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * PulseFit Platform - Eureka Service Registry.
 * Every microservice (member-service, class-service, booking-service) and
 * the api-gateway register here and discover each other by logical name
 * instead of hardcoded host:port pairs.
 *
 * Deployed standalone (see deployment/GCP_CLI_DEPLOYMENT_GUIDE.md, Part 10)
 * on one platform VM - register-with-eureka / fetch-registry are left at
 * their defaults (disabled for the registry itself, see application.yml).
 */
@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceRegistryApplication.class, args);
    }
}
