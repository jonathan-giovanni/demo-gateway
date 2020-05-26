package com.softlutiontech.ws.demogateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DemoGatewayApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoGatewayApplication.class, args);
	}

}
