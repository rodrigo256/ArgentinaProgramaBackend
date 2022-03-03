package com.portfolio.backend.repositories;

import com.portfolio.backend.models.ProyectoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends
  JpaRepository<ProyectoModel,Integer> {
}
