package io.microservice.springbootsleuthzipkin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.UUID;

@RestController
public class GenericController {

    @GetMapping("/uuid")
    public  String generateUUID(){
        return  UUID.randomUUID()+" generated at time:: "+new Date();
    }
}
