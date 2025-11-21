package com.salesianostriana.ejercicioEvaluacion.controller;

import com.salesianostriana.ejercicioEvaluacion.model.Museo;
import com.salesianostriana.ejercicioEvaluacion.service.MuseoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@Controller
public class MuseoController {

    @Autowired
    private MuseoService museoService;

    @GetMapping("/museum")
    public Optional<Museo> obtenerMuseos(){
        museoService.findAll();
    }

    @GetMapping("/museum/{id}")
    public void obtenerMuseoById(Long id){
        museoService.findAll();
    }

    @PostMapping("/museum")
    public void crearNuevoMuseo(){
    }

}
