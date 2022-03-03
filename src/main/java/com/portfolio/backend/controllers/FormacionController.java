package com.portfolio.backend.controllers;

import com.portfolio.backend.models.FormacionModel;
import com.portfolio.backend.repositories.FormacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/formaciones")
public class FormacionController {

  @Autowired
  private FormacionRepository formacionRepository;

  @GetMapping("")
  List<FormacionModel> index(){
    return formacionRepository.findAll();
  }

  @PreAuthorize("hasRole('ADMIN')")
  @ResponseStatus(HttpStatus.CREATED)
  @PostMapping("")
  FormacionModel create(@RequestBody FormacionModel formacion){
    return formacionRepository.save(formacion);
  }

  @PreAuthorize("hasRole('ADMIN')")
  @PutMapping("{id}")
  FormacionModel update(@PathVariable Integer id, @RequestBody FormacionModel formacion){
    FormacionModel formacionFromDb = formacionRepository
      .findById(id)
      .orElseThrow(RuntimeException::new);

    formacionFromDb.setTitulo(formacion.getTitulo());
    formacionFromDb.setDescripcion(formacion.getDescripcion());

    return formacionRepository.save(formacionFromDb);
  }

  @PreAuthorize("hasRole('ADMIN')")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  @DeleteMapping("{id}")
  void delete(@PathVariable Integer id){
    FormacionModel formacionFromDb = formacionRepository
      .findById(id)
      .orElseThrow(RuntimeException::new);

    formacionRepository.delete(formacionFromDb);
  }

}
