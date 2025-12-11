package com.sandesh.RESTAPIsSpringBoot.controller;


import com.sandesh.RESTAPIsSpringBoot.dto.SishyaDto;
import com.sandesh.RESTAPIsSpringBoot.dto.SishyaInsertDTO;
import com.sandesh.RESTAPIsSpringBoot.entity.Sishya;
import com.sandesh.RESTAPIsSpringBoot.service.SishyaService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sishya")
public class SishyaController {

    private final SishyaService sishyaService;

    public SishyaController(SishyaService sishyaService) {
        this.sishyaService = sishyaService;
    }
    //instead of field dependency injection, we could have done: @RequiredArgsConstructor

    @GetMapping("/ViewAll")
    public List<SishyaDto> getSishya() {
        return sishyaService.getAllSishya();
    }

    @GetMapping("/View/{id}")//path variable
    public SishyaDto getSishyaById(@PathVariable Long id) {
        return sishyaService.getSishyaById(id);
    }

    @PostMapping("/add")
    public SishyaInsertDTO addSishya(@RequestBody SishyaInsertDTO sishyaInsertDTO) {
        sishyaService.insertSishya(sishyaInsertDTO);
        return sishyaInsertDTO;
    }
}
