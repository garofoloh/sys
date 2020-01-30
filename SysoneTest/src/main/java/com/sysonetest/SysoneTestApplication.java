package com.sysonetest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SysoneTestApplication implements CommandLineRunner {
    @Autowired
    JdbcTemplate jdbcTemplate;
        public static void main(String[] args) {
        SpringApplication.run(SysoneTestApplication.class, args);
        
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("hernye");
        jdbcTemplate.execute("INSERT INTO COMODIDADES (COMODIDADID,NOMBRE, PRECIO) VALUES (1,'TC',12000)");
        jdbcTemplate.execute("INSERT INTO COMODIDADES (COMODIDADID,NOMBRE, PRECIO) VALUES (2,'AA',20000)");
        jdbcTemplate.execute("INSERT INTO COMODIDADES (COMODIDADID,NOMBRE, PRECIO) VALUES (3,'ABS',14000)");
        jdbcTemplate.execute("INSERT INTO COMODIDADES (COMODIDADID,NOMBRE, PRECIO) VALUES (4,'AB',7000)");
        jdbcTemplate.execute("INSERT INTO COMODIDADES (COMODIDADID,NOMBRE, PRECIO) VALUES (5,'LL',12000)");
        
        jdbcTemplate.execute("INSERT INTO AUTOMOVILES (AUTOMOVIL_ID,NOMBRE,PRECIO_BASICO) VALUES (1,'sedan',230000)");
        jdbcTemplate.execute("INSERT INTO AUTOMOVILES (AUTOMOVIL_ID,NOMBRE,PRECIO_BASICO) VALUES (2,'sedan',230000)");
        jdbcTemplate.execute("INSERT INTO AUTOMOVILES (AUTOMOVIL_ID,NOMBRE,PRECIO_BASICO) VALUES (3,'familiar',245000)");
        jdbcTemplate.execute("INSERT INTO AUTOMOVILES (AUTOMOVIL_ID,NOMBRE,PRECIO_BASICO) VALUES (4,'coupe',270000)");
        jdbcTemplate.execute("INSERT INTO AUTOMOVILES (AUTOMOVIL_ID,NOMBRE,PRECIO_BASICO) VALUES (5,'familiar  ',245000)");
        
        jdbcTemplate.execute("INSERT INTO AUTOMOVILES_COMODIDADES (AUTOMOVIL_ID, COMODIDADID) VALUES (1, 1);");
        jdbcTemplate.execute("INSERT INTO AUTOMOVILES_COMODIDADES (AUTOMOVIL_ID, COMODIDADID) VALUES (1, 2);");
        jdbcTemplate.execute("INSERT INTO AUTOMOVILES_COMODIDADES (AUTOMOVIL_ID, COMODIDADID) VALUES (1, 3);");
        jdbcTemplate.execute("INSERT INTO AUTOMOVILES_COMODIDADES (AUTOMOVIL_ID, COMODIDADID) VALUES (3, 3);");
        jdbcTemplate.execute("INSERT INTO AUTOMOVILES_COMODIDADES (AUTOMOVIL_ID, COMODIDADID) VALUES (3, 4);");
        jdbcTemplate.execute("INSERT INTO AUTOMOVILES_COMODIDADES (AUTOMOVIL_ID, COMODIDADID) VALUES (4, 1);");
        jdbcTemplate.execute("INSERT INTO AUTOMOVILES_COMODIDADES (AUTOMOVIL_ID, COMODIDADID) VALUES (4, 2);");
        jdbcTemplate.execute("INSERT INTO AUTOMOVILES_COMODIDADES (AUTOMOVIL_ID, COMODIDADID) VALUES (4, 3);");
        jdbcTemplate.execute("INSERT INTO AUTOMOVILES_COMODIDADES (AUTOMOVIL_ID, COMODIDADID) VALUES (4, 4);");
        jdbcTemplate.execute("INSERT INTO AUTOMOVILES_COMODIDADES (AUTOMOVIL_ID, COMODIDADID) VALUES (4, 5);");
        
    }
}
