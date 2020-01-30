package com.sysonetest.controller;

import com.sysonetest.entity.Automovil;
import com.sysonetest.service.AutomovilService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/automovil")
public class AutomovilRestController {

    AutomovilService automovilService;

    @Autowired
    public AutomovilRestController(AutomovilService automovilService) {
        this.automovilService = automovilService;
    }

    @GetMapping("/listaAutomoviles")
    public List<Automovil> index() {
        List<Automovil> autos = this.automovilService.findAll();

        return autos;
    }

    @GetMapping("/listadoAutomovilPorId/{id}")
    public Automovil indexId(@PathVariable Long id) {
        Automovil auto = this.automovilService.findById(id);
 
       auto.calcularPrecio(auto, auto.getComodidades());

        return auto;
    }

    @PostMapping("/automovil")
    public ResponseEntity<?> createAutomovil(@RequestBody Automovil automovil) {

        Automovil automovilNew = null;
        Map<String, Object> response = new HashMap<>();

        try {
            automovilNew = this.automovilService.save(automovil);

        } catch (DataAccessException e) {
            response.put("mensaje", "Error al insertar en la base de datos!");
            response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));

            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        response.put("mensaje", "El Automovil ha sido creado con exito!");
        response.put("torneo", automovilNew);
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
    }

}
