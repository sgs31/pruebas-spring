/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.app.repository;

import com.ejemplo.app.model.Experiencia;
import com.ejemplo.app.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Agustin
 */
public interface ExperienciaRepository extends JpaRepository<Experiencia, Long> {
    
}
