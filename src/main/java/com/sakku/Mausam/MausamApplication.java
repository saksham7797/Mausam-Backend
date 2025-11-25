package com.sakku.Mausam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.cache.CacheManager;

@SpringBootApplication
@EnableCaching
public class MausamApplication {

	public static void main(String[] args) {
		SpringApplication.run(MausamApplication.class, args);
	}

	@Bean
	RestTemplate bnda() {
		return new RestTemplate();
	}

	@Bean
	public org.springframework.web.servlet.config.annotation.WebMvcConfigurer corsConfigurer() {
		return new org.springframework.web.servlet.config.annotation.WebMvcConfigurer() {
			@Override
			public void addCorsMappings(org.springframework.web.servlet.config.annotation.CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("http://localhost:5173");
			}
		};
	}

}
