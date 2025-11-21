package com.salesianostriana.ejercicioEvaluacion.service;

import com.salesianostriana.ejercicioEvaluacion.error.MuseoError;
import com.salesianostriana.ejercicioEvaluacion.model.Museo;
import com.salesianostriana.ejercicioEvaluacion.repository.MuseoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MuseoService {

    @Autowired
    private MuseoRepository museoRepository;

    @Autowired
    private MuseoError error;

    public List<Museo> findAll(){
        List<Long> all = museoRepository.findAll();
        return all;
    }

    public Museo findById(Long id){
        return museoRepository.findById(id)
                .orElseThrow(error.MuseumNotFoundException());
    }

}