/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejemplo.app.controller;

import com.ejemplo.app.model.Experiencia;
import com.ejemplo.app.model.Persona;
import com.ejemplo.app.service.IExperienciaService;
import com.ejemplo.app.service.IPersonaService;
import java.util.List;
import static org.hibernate.criterion.Projections.id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Agustin
 */
@RestController
public class PersonaController {
    
    @Autowired
    IPersonaService interPersona;
    
    @Autowired
    IExperienciaService interExp;
    
    @GetMapping("/estudiantes/traer")
    public List<Persona> getAllStudents(){
        return interPersona.getPersonas();
    }
    
    @PostMapping("/estudiantes/registrar")
    public String createStudent(@RequestBody Persona student){
        interPersona.savePersona(student);
        return "El estudiante se registro correctamente";
    }
    
     @PostMapping("/estudiantes/registrar-exp/{id}")
    public String addExpStudent(@PathVariable Long id, @RequestBody Experiencia exp){
        Persona aux = interPersona.findPersona(id);
        interExp.registrarExperiencia(exp);
        return "Se agrego exp al estudiante";
    }
    
    @DeleteMapping("estudiantes/borrar/{id}")
    public String deleteStudent(@PathVariable Long id){
        interPersona.deletePersona(id);
        return "Se elimino de la bases de datos al estudiante";
    }
    
    @PutMapping("estudiantes/editar/{id}")
    public Persona editStudent(@PathVariable Long id,
            @RequestParam ("nombre") String nombre,
            @RequestParam ("apellido") String apellido,
            @RequestParam ("edad") int edad){
        
        Persona perso = interPersona.findPersona(id);
        perso.setApellido(apellido);
        perso.setNombre(nombre);
        perso.setEdad(edad);
        
        interPersona.savePersona(perso);
        
        return perso;
    }
}
