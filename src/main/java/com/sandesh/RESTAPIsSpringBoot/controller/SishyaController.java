package com.sandesh.RESTAPIsSpringBoot.controller;

import com.sandesh.RESTAPIsSpringBoot.dto.SishyaDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SishyaController {

    @GetMapping("/sishya")
    public SishyaDto getSishya() {
        return new SishyaDto(1L, "Sandesh", "Sindhuli","Khatiwadasandesh@gmail.com");
    }
}
