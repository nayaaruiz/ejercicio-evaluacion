package com.salesianostriana.ejercicioEvaluacion.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Museo {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private String ciudad;
    private int apertura;
    private int salas;
    private String descripcion;
    private String url;

}
