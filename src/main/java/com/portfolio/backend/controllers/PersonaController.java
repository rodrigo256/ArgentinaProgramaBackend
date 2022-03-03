package com.portfolio.backend.controllers;

import com.portfolio.backend.models.PersonaModel;
import com.portfolio.backend.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@CrossOrigin
@RequestMapping("/persona")
public class PersonaController {

  @Autowired
  private PersonaRepository personaRepository;

  @GetMapping("")
  Optional<PersonaModel> index(){
    return personaRepository.findById(1);
  }

  @PreAuthorize("hasRole('ADMIN')")
  @ResponseStatus(HttpStatus.CREATED)
  @PostMapping("")
  PersonaModel create(@RequestBody PersonaModel personaModel){
    return personaRepository.save(personaModel);
  }

  @PreAuthorize("hasRole('ADMIN')")
  @PutMapping("{id}")
  PersonaModel update(@PathVariable Integer id, @RequestBody PersonaModel personaModel){
    PersonaModel personaFromDb = personaRepository
      .findById(id)
      .orElseThrow(RuntimeException::new);

    personaFromDb.setApellido(personaModel.getApellido());
    personaFromDb.setNombre(personaModel.getNombre());
    personaFromDb.setCorreo(personaModel.getCorreo());
    personaFromDb.setTitulo(personaModel.getTitulo());
    personaFromDb.setPais(personaModel.getPais());
    personaFromDb.setExperiencia_laboral(personaModel.getExperiencia_laboral());
    personaFromDb.setUrl_foto(personaModel.getUrl_foto());

    return personaRepository.save(personaFromDb);
  }

  @PreAuthorize("hasRole('ADMIN')")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  @DeleteMapping("{id}")
  void delete(@PathVariable Integer id){
    PersonaModel personaFromDb = personaRepository
      .findById(id)
      .orElseThrow(RuntimeException::new);

    personaRepository.delete(personaFromDb);
  }
}
