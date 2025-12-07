package com.sandesh.RESTAPIsSpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Health {

    @GetMapping("/health")
    public String health() {
        return "<h1>OK, EVERYTHING IS UP<h1>";
    }

}
