package com.example.msmorenoalva.infraestructure.repository;

import com.example.msmorenoalva.infraestructure.entity.TipoPersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface TipoPersonaRepository extends JpaRepository<TipoPersonaEntity, Long> {

    TipoPersonaEntity findByCodTipo(@Param("codTipo") String codTipo);
}
