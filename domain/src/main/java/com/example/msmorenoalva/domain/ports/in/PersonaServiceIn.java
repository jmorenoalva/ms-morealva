package com.example.msmorenoalva.domain.ports.in;

import com.example.msmorenoalva.domain.aggregates.dto.PersonaDTO;
import com.example.msmorenoalva.domain.aggregates.request.RequestPersona;

import java.util.List;
import java.util.Optional;

public interface PersonaServiceIn {
    PersonaDTO crearPersonaIn(RequestPersona requestPersona);
    Optional<PersonaDTO> obtenerPersonaIn(String numero);
    Optional<PersonaDTO> obtenerPersonaIdIn(Long id);
    List<PersonaDTO> obtenerTodosIn();
    List<PersonaDTO> obtenerTodosActivosIn();
    PersonaDTO actualizarIn(Long id, RequestPersona requestPersona);
    PersonaDTO deleteIn(Long id);
}
