package com.portfolio.backend.repositories;

import com.portfolio.backend.models.FormacionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormacionRepository extends JpaRepository<FormacionModel,Integer> {

}
