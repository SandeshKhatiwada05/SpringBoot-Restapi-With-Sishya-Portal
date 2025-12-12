package com.sandesh.RESTAPIsSpringBoot.service;

import com.sandesh.RESTAPIsSpringBoot.dto.SishyaDto;
import com.sandesh.RESTAPIsSpringBoot.dto.SishyaInsertDTO;
import com.sandesh.RESTAPIsSpringBoot.entity.Sishya;
import org.jspecify.annotations.Nullable;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

public interface SishyaService {
    public List<SishyaDto> getAllSishya();
    public SishyaDto getSishyaById(Long id);
    public String insertSishya(SishyaInsertDTO sishyaInsertDTO);
    public void deleteSishya(Long id);
    public SishyaDto updateSishya(Long id, SishyaInsertDTO sishyaInsertDTO);

    public SishyaDto patchTheSishya(Long id, Map<String, Object> update);
}
