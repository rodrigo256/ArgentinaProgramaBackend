package com.portfolio.backend.security.repositories;

import com.portfolio.backend.security.enums.RolNombre;
import com.portfolio.backend.security.models.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RolRepository extends JpaRepository<Rol, Integer> {
  Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
