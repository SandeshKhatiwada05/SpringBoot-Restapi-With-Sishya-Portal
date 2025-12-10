package com.sandesh.RESTAPIsSpringBoot.controller;

import com.sandesh.RESTAPIsSpringBoot.dto.SishyaDto;
import com.sandesh.RESTAPIsSpringBoot.entity.Sishya;
import com.sandesh.RESTAPIsSpringBoot.repository.SishyaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SishyaController {

    private final SishyaRepository sishyaRepository;

    public SishyaController(SishyaRepository sishyaRepository) {
        this.sishyaRepository = sishyaRepository;
    }

    @GetMapping("/sishyaViewAll")
    public List<Sishya> getSishya() {
        return sishyaRepository.findAll();
    }
}
