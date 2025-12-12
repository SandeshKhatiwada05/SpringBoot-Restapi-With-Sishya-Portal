    package com.sandesh.RESTAPIsSpringBoot.service.impl;

    import com.sandesh.RESTAPIsSpringBoot.dto.SishyaDto;
    import com.sandesh.RESTAPIsSpringBoot.dto.SishyaInsertDTO;
    import com.sandesh.RESTAPIsSpringBoot.entity.Sishya;
    import com.sandesh.RESTAPIsSpringBoot.repository.SishyaRepository;
    import com.sandesh.RESTAPIsSpringBoot.service.SishyaService;
    import jakarta.persistence.EntityNotFoundException;
    import lombok.RequiredArgsConstructor;
    import org.jspecify.annotations.Nullable;
    import org.modelmapper.ModelMapper;
    import org.springframework.stereotype.Service;
    import org.springframework.web.bind.annotation.ExceptionHandler;

    import java.util.ArrayList;
    import java.util.List;
    import java.util.Map;

    @Service
    @RequiredArgsConstructor //this makes constructor instead of making constructor for DI
    public class SishyaServiceImpl implements SishyaService {

        private final SishyaRepository sishyaRepository;
        private final ModelMapper modelMapper;

        @ExceptionHandler(EntityNotFoundException.class)
        @Override
        public List<SishyaDto> getAllSishya() {
            List<Sishya> sishyas = sishyaRepository.findAll();
            //change entity to dto and hence to list
            List<SishyaDto> sishyaDtos = sishyas.stream()
                    .map(sishya -> new SishyaDto(sishya.getId(), sishya.getNaam(), sishya.getNivasha(), sishya.getEPatram()))
                    .toList();
            return sishyaDtos;//this could have been done without variable creation
        }

        @Override
        public SishyaDto getSishyaById(Long id) {
            Sishya sishya = sishyaRepository.findById(id).orElse(null);
            if (sishya == null) return null; // prevent ModelMapper from breaking
            return modelMapper.map(sishya, SishyaDto.class);
        }

        @Override
        public String insertSishya(SishyaInsertDTO sishyaInsertDTO) {
            Sishya sishyaToAdd = modelMapper.map(sishyaInsertDTO, Sishya.class);
            sishyaRepository.save(sishyaToAdd);
            return "Added sishya successfully";
        }

        @Override
        public void deleteSishya(Long id) {
            if (!sishyaRepository.existsById(id)) {
                throw new EntityNotFoundException("Sishya with id " + id + " not found");
            }
            sishyaRepository.deleteById(id);
        }

        @Override
        public SishyaDto updateSishya(Long id, SishyaInsertDTO sishyaInsertDTO) {
            Sishya sishya = sishyaRepository.findById(id).orElse(null);
            if (sishya == null) return null;
            modelMapper.map(sishyaInsertDTO, sishya);
            sishyaRepository.save(sishya);
            return modelMapper.map(sishya, SishyaDto.class);
        }

        @Override
        public SishyaDto patchTheSishya(Long id, Map<String, Object> update) {
            Sishya sishya = sishyaRepository.findById(id).orElse(null);
            if (sishya == null) return null;
            update.forEach((field, value) -> {
                switch (field) {
                    case "naam":
                        sishya.setNaam((String) value);
                        break;
                    case "nivasha":
                        sishya.setNivasha((String) value);
                        break;
                    case "ePatram":
                        sishya.setEPatram((String) value);
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown field: " + field);
                }
            });
            sishyaRepository.save(sishya);
            return modelMapper.map(sishya, SishyaDto.class);
        }
    }

