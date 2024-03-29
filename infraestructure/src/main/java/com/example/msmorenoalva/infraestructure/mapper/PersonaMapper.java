package com.example.msmorenoalva.infraestructure.mapper;

import com.example.msmorenoalva.domain.aggregates.dto.PersonaDTO;
import com.example.msmorenoalva.infraestructure.entity.PersonaEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service

public class  PersonaMapper {
    private static final ModelMapper modelMapper = new ModelMapper();

    public PersonaDTO mapToDto(PersonaEntity entity){
        return modelMapper.map(entity, PersonaDTO.class);
    }

    public PersonaEntity mapToEntity(PersonaDTO personaDTO){
        return modelMapper.map(personaDTO, PersonaEntity.class);
    }
}
