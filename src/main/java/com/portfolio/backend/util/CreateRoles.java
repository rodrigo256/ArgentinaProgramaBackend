package com.portfolio.backend.util;

import com.portfolio.backend.security.enums.RolNombre;
import com.portfolio.backend.security.models.Rol;
import com.portfolio.backend.security.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CreateRoles implements CommandLineRunner {

    @Autowired
    RolService rolService;
    @Override
    public void run(String... args) throws Exception {
        Rol rolAdmin = new Rol(RolNombre.ROLE_ADMIN);
        rolService.save(rolAdmin);
    }
}
