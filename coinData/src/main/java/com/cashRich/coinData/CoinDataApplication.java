package com.cashRich.coinData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.access.event.PublicInvocationEvent;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CoinDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoinDataApplication.class, args);
	
		}
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
