package com.portfolio.backend.controllers;

import com.portfolio.backend.models.ExperienciaModel;
import com.portfolio.backend.repositories.ExperienciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/experiencias")
public class ExperienciaController {

  @Autowired
  private ExperienciaRepository experienciaRepository;

  @GetMapping("")
  List<ExperienciaModel> index(){
    return experienciaRepository.findAll();
  }

  @PreAuthorize("hasRole('ADMIN')")
  @ResponseStatus(HttpStatus.CREATED)
  @PostMapping("")
  ExperienciaModel create(@RequestBody ExperienciaModel experiencia){
    return experienciaRepository.save(experiencia);
  }

  @PreAuthorize("hasRole('ADMIN')")
  @PutMapping("{id}")
  ExperienciaModel update(@PathVariable Integer id, @RequestBody ExperienciaModel experiencia){
    ExperienciaModel experienciaFromDb = experienciaRepository
      .findById(id)
      .orElseThrow(RuntimeException::new);

    experienciaFromDb.setTitulo(experiencia.getTitulo());
    experienciaFromDb.setDescripcion(experiencia.getDescripcion());

    return experienciaRepository.save(experienciaFromDb);
  }

  @PreAuthorize("hasRole('ADMIN')")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  @DeleteMapping("{id}")
  void delete(@PathVariable Integer id){
    ExperienciaModel experienciaFromDb = experienciaRepository
      .findById(id)
      .orElseThrow(RuntimeException::new);

    experienciaRepository.delete(experienciaFromDb);
  }
}
