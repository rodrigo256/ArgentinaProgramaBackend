package com.portfolio.backend.repositories;

import com.portfolio.backend.models.AcercaDeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcercaDeRepository extends JpaRepository<AcercaDeModel, Integer> {
}
