package com.portfolio.backend.controllers;


import com.portfolio.backend.models.HabilidadModel;
import com.portfolio.backend.repositories.HabilidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/habilidad")
public class HabilidadController {

  @Autowired
  private HabilidadRepository habilidadRepository;

  @GetMapping("")
  List<HabilidadModel> index(){
    return habilidadRepository.findAll();
  }

  @PreAuthorize("hasRole('ADMIN')")
  @ResponseStatus(HttpStatus.CREATED)
  @PostMapping("")
  HabilidadModel create(@RequestBody HabilidadModel habilidad){
    return habilidadRepository.save(habilidad);
  }

  @PreAuthorize("hasRole('ADMIN')")
  @PutMapping("{id}")
  HabilidadModel update(@PathVariable Integer id, @RequestBody HabilidadModel habilidad){
    HabilidadModel habilidadFromDb = habilidadRepository
      .findById(id)
      .orElseThrow(RuntimeException::new);

    habilidadFromDb.setNombre(habilidad.getNombre());
    habilidadFromDb.setUrl_imagen(habilidad.getUrl_imagen());

    return habilidadRepository.save(habilidadFromDb);
  }

  @PreAuthorize("hasRole('ADMIN')")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  @DeleteMapping("{id}")
  void delete(@PathVariable Integer id){
    HabilidadModel habilidadFromDb = habilidadRepository
      .findById(id)
      .orElseThrow(RuntimeException::new);

    habilidadRepository.delete(habilidadFromDb);
  }

}
