package com.sandesh.RESTAPIsSpringBoot.service;

import com.sandesh.RESTAPIsSpringBoot.dto.SishyaDto;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface SishyaService {
    public List<SishyaDto> getAllSishya();
    public SishyaDto getSishyaById(Long id);
}
