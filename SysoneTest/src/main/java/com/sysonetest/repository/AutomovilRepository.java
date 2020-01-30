package com.sysonetest.repository;

import com.sysonetest.entity.Automovil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("userRepository")
public interface AutomovilRepository extends JpaRepository<Automovil, Long>{

    public Automovil findAutomovilBynombre(String nombre);

    
    
}
