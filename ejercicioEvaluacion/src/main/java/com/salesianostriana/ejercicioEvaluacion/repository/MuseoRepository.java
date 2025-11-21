package com.salesianostriana.ejercicioEvaluacion.repository;

import com.salesianostriana.ejercicioEvaluacion.model.Museo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MuseoRepository extends JpaRepository<Long, Museo> {
}
