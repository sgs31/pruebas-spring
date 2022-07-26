/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejemplo.app.service;

import com.ejemplo.app.model.Experiencia;
import com.ejemplo.app.model.Persona;
import java.util.List;

/**
 *
 * @author Agustin
 */
public interface IPersonaService {
    
    public List<Persona> getPersonas();
    
    public void savePersona(Persona person);
    
    public void deletePersona(Long id);
    
    public Persona findPersona(Long id);
   
}
