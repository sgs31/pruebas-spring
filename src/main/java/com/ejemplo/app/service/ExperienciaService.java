/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.app.service;

import com.ejemplo.app.model.Experiencia;
import com.ejemplo.app.repository.ExperienciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Agustin
 */
@Service
public class ExperienciaService implements IExperienciaService{
    
     @Autowired
    private ExperienciaRepository expeRepository;
    
    @Override
    public void registrarExperiencia(Experiencia exp) {
        expeRepository.save(exp);
    }
    
}
