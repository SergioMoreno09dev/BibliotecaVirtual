package com.universidad.biblio.service;

import com.universidad.biblio.model.User;
import com.universidad.biblio.repository.UserRepository;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServi {

    private final UserRepository repo;
    private final PasswordEncoder encoder;

    public UserServi(UserRepository repo,
                     PasswordEncoder encoder) {

        this.repo = repo;
        this.encoder = encoder;
    }

    public void register(User user) {

        if (repo.existsByEmail(user.getEmail())) {

            throw new RuntimeException(
                    "El correo ya está registrado"
            );
        }

        user.setPassword(
                encoder.encode(user.getPassword())
        );

        user.setRol("ROLE_USER");

        repo.save(user);
    }
}