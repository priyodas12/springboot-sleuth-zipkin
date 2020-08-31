package io.microservice.springbootsleuthzipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"io.microservice.springbootsleuthzipkin.*"})
public class SpringbootSleuthZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSleuthZipkinApplication.class, args);
	}

}
