package com.sandesh.RESTAPIsSpringBoot.service;

import com.sandesh.RESTAPIsSpringBoot.dto.SishyaDto;
import com.sandesh.RESTAPIsSpringBoot.dto.SishyaInsertDTO;
import com.sandesh.RESTAPIsSpringBoot.entity.Sishya;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface SishyaService {
    public List<SishyaDto> getAllSishya();
    public SishyaDto getSishyaById(Long id);
    public String insertSishya(SishyaInsertDTO sishyaInsertDTO);
}
