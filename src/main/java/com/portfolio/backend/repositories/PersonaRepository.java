package com.portfolio.backend.repositories;

import com.portfolio.backend.models.PersonaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<PersonaModel,Integer> {

}
