package com.productinventry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProductappInventryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductappInventryServiceApplication.class, args);
	}

	
	
}
