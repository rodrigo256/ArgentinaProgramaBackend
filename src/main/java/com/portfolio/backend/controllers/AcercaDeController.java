package com.portfolio.backend.controllers;

import com.portfolio.backend.models.AcercaDeModel;
import com.portfolio.backend.repositories.AcercaDeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@CrossOrigin
@RequestMapping("/info")
public class AcercaDeController {

  @Autowired
  private AcercaDeRepository acercaDeRepository;

  @GetMapping("")
  Optional<AcercaDeModel> index(){
    return acercaDeRepository.findById(1);
  }

  @PreAuthorize("hasRole('ADMIN')")
  @ResponseStatus(HttpStatus.CREATED)
  @PostMapping("")
  AcercaDeModel create(@RequestBody AcercaDeModel acercade){
    return acercaDeRepository.save(acercade);
  }

  @PreAuthorize("hasRole('ADMIN')")
  @PutMapping("{id}")
  AcercaDeModel update(@PathVariable Integer id, @RequestBody AcercaDeModel acercade){
    AcercaDeModel acercaFromDb = acercaDeRepository
      .findById(id)
      .orElseThrow(RuntimeException::new);

    acercaFromDb.setAcerca(acercade.getAcerca());

    return acercaDeRepository.save(acercaFromDb);
  }

  @PreAuthorize("hasRole('ADMIN')")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  @DeleteMapping("{id}")
  void delete(@PathVariable Integer id){
    AcercaDeModel acercaFromDb = acercaDeRepository
      .findById(id)
      .orElseThrow(RuntimeException::new);

    acercaDeRepository.delete(acercaFromDb);
  }

}
