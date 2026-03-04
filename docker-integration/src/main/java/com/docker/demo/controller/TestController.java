package com.docker.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class TestController {

    @GetMapping
    public ResponseEntity<String> sampleResponse() {
        return ResponseEntity.ok("HI SCONEXSOFT I SUCCESSFULLY IMPLEMENTED THE GITHUB WEBHOOK");
    }
}
