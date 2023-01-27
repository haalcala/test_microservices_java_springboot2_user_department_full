package com.mycompany.api.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.apache.http.client.HttpClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@CircuitBreaker(name = "myCircuitBreaker", fallbackMethod = "/userServiceFallback")
public class ApiServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiServiceApplication.class, args);
	}

}
