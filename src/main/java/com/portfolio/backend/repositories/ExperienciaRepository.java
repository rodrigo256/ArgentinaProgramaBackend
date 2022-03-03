package com.portfolio.backend.repositories;

import com.portfolio.backend.models.ExperienciaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository<ExperienciaModel, Integer> {
}
