package com.portfolio.backend.security.repositories;

import com.portfolio.backend.security.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
  Optional<Usuario> findByNombreUsuario(String nombreUsuario);
  boolean existsByNombreUsuario(String nombreUsuario);
  boolean existsByEmail(String email);
}
