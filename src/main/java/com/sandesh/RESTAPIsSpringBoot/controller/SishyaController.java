package com.sandesh.RESTAPIsSpringBoot.controller;


import com.sandesh.RESTAPIsSpringBoot.dto.SishyaDto;
import com.sandesh.RESTAPIsSpringBoot.dto.SishyaInsertDTO;
import com.sandesh.RESTAPIsSpringBoot.entity.Sishya;
import com.sandesh.RESTAPIsSpringBoot.service.SishyaService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<SishyaDto>> getSishya() {
        return ResponseEntity.status(HttpStatus.OK).body(sishyaService.getAllSishya()); //style 1
    }

    @GetMapping("/View/{id}")//path variable
    public ResponseEntity<SishyaDto> getSishyaById(@PathVariable Long id) {
        return ResponseEntity.ok(sishyaService.getSishyaById(id)); //style 2
    }

    @PostMapping("/add")
    public ResponseEntity<SishyaInsertDTO> addSishya(@RequestBody SishyaInsertDTO sishyaInsertDTO) {
        sishyaService.insertSishya(sishyaInsertDTO);
        return new ResponseEntity<>(sishyaInsertDTO, HttpStatus.CREATED); //style 3
    }
}
