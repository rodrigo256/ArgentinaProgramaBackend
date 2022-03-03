package com.portfolio.backend.repositories;

import com.portfolio.backend.models.HabilidadModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadRepository extends JpaRepository<HabilidadModel,Integer> {
}
