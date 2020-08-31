package io.microservice.springbootsleuthzipkin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.web.client.RestTemplate;

@Configuration
public class SleuthConfig {

    @Bean
    public AlwaysSampler alwaysSampler() {
        return new AlwaysSampler();
    }

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
