package com.portfolio.backend.security.service;


import com.portfolio.backend.security.enums.RolNombre;
import com.portfolio.backend.security.models.Rol;
import com.portfolio.backend.security.repositories.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class RolService {
  @Autowired
  RolRepository rolRepository;
  public Optional<Rol> getByRolNombre(RolNombre rolNombre){
    return  rolRepository.findByRolNombre(rolNombre);
  }
  public void save(Rol rol){
    rolRepository.save(rol);
  }
}
