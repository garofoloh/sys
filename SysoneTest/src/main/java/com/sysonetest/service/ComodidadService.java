
package com.sysonetest.service;

import com.sysonetest.entity.Comodidad;
import com.sysonetest.repository.ComodidadesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("comodidadService")
public class ComodidadService {
    
    private ComodidadesRepository comodidadesRepository;
    
    @Autowired
    public ComodidadService(ComodidadesRepository comodidadesRepository) {
        this.comodidadesRepository = comodidadesRepository;
    }
    public List<Comodidad> findAll() {
        return this.comodidadesRepository.findAll();
    }
    
}
