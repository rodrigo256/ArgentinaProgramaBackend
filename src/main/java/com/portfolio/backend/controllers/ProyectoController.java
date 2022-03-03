package com.portfolio.backend.controllers;

import com.portfolio.backend.models.ProyectoModel;
import com.portfolio.backend.repositories.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/proyecto")
public class ProyectoController {
  @Autowired
  private ProyectoRepository proyectoRepository;

  @GetMapping("")
  List<ProyectoModel> index(){
    return proyectoRepository.findAll();
  }

  @PreAuthorize("hasRole('ADMIN')")
  @ResponseStatus(HttpStatus.CREATED)
  @PostMapping("")
  ProyectoModel create(@RequestBody ProyectoModel proyecto){
    return proyectoRepository.save(proyecto);
  }

  @PreAuthorize("hasRole('ADMIN')")
  @PutMapping("{id}")
  ProyectoModel update(@PathVariable Integer id, @RequestBody ProyectoModel proyecto){
    ProyectoModel proyectoFromDb = proyectoRepository
      .findById(id)
      .orElseThrow(RuntimeException::new);

    proyectoFromDb.setTitulo(proyecto.getTitulo());
    proyectoFromDb.setDescripcion(proyecto.getDescripcion());
    proyectoFromDb.setUrl_demo(proyecto.getUrl_demo());
    proyectoFromDb.setUrl_git(proyecto.getUrl_git());
    proyectoFromDb.setUrl_portada(proyecto.getUrl_portada());

    return proyectoRepository.save(proyectoFromDb);
  }

  @PreAuthorize("hasRole('ADMIN')")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  @DeleteMapping("{id}")
  void delete (@PathVariable Integer id){
    ProyectoModel proyectoFromDb = proyectoRepository
      .findById(id)
      .orElseThrow(RuntimeException::new);

    proyectoRepository.delete(proyectoFromDb);
  }
}
