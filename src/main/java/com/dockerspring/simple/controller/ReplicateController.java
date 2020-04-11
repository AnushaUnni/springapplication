package com.dockerspring.simple.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/replicate")
public class ReplicateController {

    @GetMapping(value="/{name}")
    public ResponseEntity welcomeMessage(@PathVariable("name") String name) {
        String response = "Hello, Welcome " + name;
        return ResponseEntity.ok(response);
    }
}
