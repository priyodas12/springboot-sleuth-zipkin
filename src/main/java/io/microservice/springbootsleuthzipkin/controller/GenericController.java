package io.microservice.springbootsleuthzipkin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.UUID;

@RestController
public class GenericController {

    private static final Logger log= LoggerFactory.getLogger(GenericController.class);

    @GetMapping("/uuid")
    public  String generateUUID(){
        log.info("generic controller called...");
        return  UUID.randomUUID()+" generated at time:: "+new Date();
    }
}
