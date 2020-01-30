package com.sysonetest.service;

import com.sysonetest.entity.Automovil;
import com.sysonetest.repository.AutomovilRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("automovilService")
public class AutomovilService {
    
    private final AutomovilRepository automovilRepository;
    @Autowired
    public AutomovilService(AutomovilRepository automovilRepository) {
        this.automovilRepository = automovilRepository;
    }
    public Automovil save(Automovil automovil) {
		return this.automovilRepository.save(automovil);
	}
	
	@Transactional(readOnly = true)
	public List<Automovil> findAll() {
		return this.automovilRepository.findAll();
	}
	
	@Transactional(readOnly = true)
	public Automovil findById(Long id) {
		return this.automovilRepository.findById(id).orElse(null);
	}
	
	@Transactional(readOnly = true)
	public Automovil findAutomovilByNombre(String nombre) {
		return this.automovilRepository.findAutomovilBynombre(nombre);
	}

	public Automovil saveAutomovil(Automovil automovilRequest) {

		return this.automovilRepository.save(automovilRequest);
	}

    public Automovil updateAutomovil(Automovil automovilActual, Automovil automovil) {
		automovilActual.setNombre(automovil.getNombre());
		automovilActual.setComodidades(automovil.getComodidades());
		automovilActual.setPrecioBasico(automovil.getPrecioBasico());
		automovilActual.setPrecioFinal(automovil.getPrecioFinal());
		return automovilRepository.save(automovilActual);
    }
    
    
    
}
