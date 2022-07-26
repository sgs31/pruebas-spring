package com.ejemplo.app.service;

import com.ejemplo.app.model.Experiencia;
import com.ejemplo.app.model.Persona;
import com.ejemplo.app.repository.ExperienciaRepository;
import com.ejemplo.app.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

/**
 *
 * @author Agustin
 */
@Service
public class PersonaService implements IPersonaService{
    @Autowired
    private PersonaRepository persoRepository;
  

    @Override
    public List<Persona> getPersonas() {
        return persoRepository.findAll();
    }

    @Override
    public void savePersona(Persona person) {
        persoRepository.save(person);
    }

    @Override
    public void deletePersona(Long id) {
        persoRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona perso = persoRepository.findById(id).orElse(null);
        return perso;
    }
}
