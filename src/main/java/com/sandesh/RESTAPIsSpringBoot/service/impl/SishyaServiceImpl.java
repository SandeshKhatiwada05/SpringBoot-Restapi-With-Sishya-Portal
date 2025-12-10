package com.sandesh.RESTAPIsSpringBoot.service.impl;

import com.sandesh.RESTAPIsSpringBoot.dto.SishyaDto;
import com.sandesh.RESTAPIsSpringBoot.entity.Sishya;
import com.sandesh.RESTAPIsSpringBoot.repository.SishyaRepository;
import com.sandesh.RESTAPIsSpringBoot.service.SishyaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor //this makes constructor instead of making constructor for DI
public class SishyaServiceImpl implements SishyaService {

    private final SishyaRepository sishyaRepository;

    @Override
    public List<SishyaDto> getAllSishya() {
        List<Sishya> sishyas = sishyaRepository.findAll();
        List<SishyaDto> sishyaDtos = sishyas.stream()
                .map(sishya -> new SishyaDto(sishya.getId(), sishya.getNaam(), sishya.getNivasha(), sishya.getEPatram()))
                .toList();
        return sishyaDtos;//this could have been done without variable creation
    }
}
