package com.example.msmorenoalva.domain.ports.out;

import com.example.msmorenoalva.domain.aggregates.dto.PersonaDTO;
import com.example.msmorenoalva.domain.aggregates.request.RequestPersona;

import java.util.List;
import java.util.Optional;

public interface PersonaServiceOut {
    PersonaDTO crearPersonaOut(RequestPersona requestPersona);
    Optional<PersonaDTO> obtenerPersonaOut(String numero);
    Optional<PersonaDTO> obtenerPersonaIdOut(Long id);
    List<PersonaDTO> obtenerTodosOut();
    List<PersonaDTO> obtenerTodosActivosOut();
    PersonaDTO actualizarOut(Long id, RequestPersona requestPersona);
    PersonaDTO deleteOut(Long id);
}
