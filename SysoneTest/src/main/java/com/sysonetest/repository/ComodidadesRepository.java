package com.sysonetest.repository;

import com.sysonetest.entity.Comodidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("comodidadRepository")
public interface ComodidadesRepository extends JpaRepository<Comodidad, Long>{
    
}
