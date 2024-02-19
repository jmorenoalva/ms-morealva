package com.example.msmorenoalva.domain.impl;

import com.example.msmorenoalva.domain.aggregates.dto.PersonaDTO;
import com.example.msmorenoalva.domain.aggregates.request.RequestPersona;
import com.example.msmorenoalva.domain.ports.in.PersonaServiceIn;
import com.example.msmorenoalva.domain.ports.out.PersonaServiceOut;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonaServiceImpl implements PersonaServiceIn {

    private final PersonaServiceOut personaServiceOut;

    @Override
    public PersonaDTO crearPersonaIn(RequestPersona requestPersona) {
        return personaServiceOut.crearPersonaOut(requestPersona);
    }

    @Override
    public Optional<PersonaDTO> obtenerPersonaIn(String numDocu) {
        return personaServiceOut.obtenerPersonaOut(numDocu);
    }

    @Override
    public Optional<PersonaDTO> obtenerPersonaIdIn(Long id) {
        return personaServiceOut.obtenerPersonaIdOut(id);
    }

    @Override
    public List<PersonaDTO> obtenerTodosIn() {

        return personaServiceOut.obtenerTodosOut();
    }

    @Override
    public List<PersonaDTO> obtenerTodosActivosIn() {
        return personaServiceOut.obtenerTodosActivosOut();
    }

    @Override
    public PersonaDTO actualizarIn(Long id, RequestPersona requestPersona) {
        return personaServiceOut.actualizarOut(id, requestPersona);
    }

    @Override
    public PersonaDTO deleteIn(Long id) {
        return personaServiceOut.deleteOut(id);
    }
}
