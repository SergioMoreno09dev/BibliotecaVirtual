package com.universidad.biblio.service;

import com.universidad.biblio.model.User;
import com.universidad.biblio.repository.UserRepository;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

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

        if (user.getRol() == null || user.getRol().isBlank()) {
            user.setRol("LECTOR");
        }

        repo.save(user);
    }

    public List<User> list() {
        return repo.findAll();
    }

    public User find(int id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
    }

    public User update(int id, User user) {
        User current = find(id);
        current.setName(user.getName());
        current.setEmail(user.getEmail());
        current.setRol(user.getRol());
        if (user.getPassword() != null && !user.getPassword().isBlank()) {
            current.setPassword(encoder.encode(user.getPassword()));
        }
        return repo.save(current);
    }

    public void delete(int id) {
        repo.delete(find(id));
    }

    public long count() {
        return repo.count();
    }
}
