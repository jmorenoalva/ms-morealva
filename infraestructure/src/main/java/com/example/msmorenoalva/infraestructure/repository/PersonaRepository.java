package com.example.msmorenoalva.infraestructure.repository;

import com.example.msmorenoalva.infraestructure.entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PersonaRepository extends JpaRepository<PersonaEntity, Long> {
    Optional<PersonaEntity> findByNumDocu(String numDocu);
    //PersonaEntity findByNumDocu(String numDocu);
    List<PersonaEntity> findByEstado(Integer estado);
}
