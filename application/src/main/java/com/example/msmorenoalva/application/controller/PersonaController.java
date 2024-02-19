package com.example.msmorenoalva.application.controller;

import com.example.msmorenoalva.domain.aggregates.dto.PersonaDTO;
import com.example.msmorenoalva.domain.aggregates.request.RequestPersona;
import com.example.msmorenoalva.domain.ports.in.PersonaServiceIn;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@OpenAPIDefinition(
        info = @Info(
                title="API-PERSONA",
                version="1.0",
                description="Mantenimiento de una PErsona"
        )
)

@RestController
@RequestMapping("/v2/persona")
@RequiredArgsConstructor
public class PersonaController {
    private final PersonaServiceIn personaServiceIn;

    @Operation(summary = "Crear una Persona")
    @PostMapping
    public ResponseEntity<PersonaDTO> registrar(@RequestBody RequestPersona requestPersona){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(personaServiceIn.crearPersonaIn(requestPersona));
    }

    @Operation(summary = "Obtiene una Persona por su numero de DNI")
    @GetMapping("/{numDocu}")
    public ResponseEntity<PersonaDTO> obtenerPersonaNumero(@PathVariable String numDocu){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(personaServiceIn.obtenerPersonaIn(numDocu).get());
    }

    @Operation(summary = "Obtiene una Persona por su id")
    @GetMapping("/id/{id}")
    public ResponseEntity<PersonaDTO> obtenerPersonaId(@PathVariable Long id){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(personaServiceIn.obtenerPersonaIdIn(id).get());
    }

    @Operation(summary = "Obtiene todas las Personas")
    @GetMapping()
    public ResponseEntity<List<PersonaDTO>> obtenerTodos(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(personaServiceIn.obtenerTodosIn());
    }

    @Operation(summary = "Obtiene todas las Personas con estado activo")
    @GetMapping("/activos")
    public ResponseEntity<List<PersonaDTO>> obtenerTodosActivos(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(personaServiceIn.obtenerTodosActivosIn());
    }

    @Operation(summary = "Actualiza una Persona")
    @PutMapping("/{id}")
    public ResponseEntity<PersonaDTO> actualizar(@PathVariable Long id, @RequestBody RequestPersona requestPersona){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(personaServiceIn.actualizarIn(id, requestPersona));
    }

    @Operation(summary = "Elimina una Persona")
    @DeleteMapping("/{id}")
    public ResponseEntity<PersonaDTO> eliminar(@PathVariable Long id){
        return  ResponseEntity
                .status(HttpStatus.OK)
                .body(personaServiceIn.deleteIn(id));
    }
}
