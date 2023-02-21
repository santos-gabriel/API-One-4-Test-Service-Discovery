package br.com.apione.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApioneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApioneApplication.class, args);
	}

}
