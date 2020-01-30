package com.sysonetest.controller;

import com.sysonetest.entity.Comodidad;
import com.sysonetest.service.ComodidadService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comodidad")
public class ComodidadRestController {
    private final ComodidadService comodidadService;

    @Autowired
    public ComodidadRestController(ComodidadService comodidadService) {
        this.comodidadService = comodidadService;
    }
    
    @GetMapping("/listadoGremios")
    public List<Comodidad> index() {
        List<Comodidad> comodidadLista = this.comodidadService.findAll();
        return comodidadLista;
    
    }
    
    
}
