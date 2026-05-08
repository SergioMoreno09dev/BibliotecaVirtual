package com.universidad.biblio.controller;

import com.universidad.biblio.model.User;
import com.universidad.biblio.service.UserServi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {

    private final UserServi service;

    public AuthController(UserServi service) {
        this.service = service;
    }

    @GetMapping("/")
    public String index() {
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/login.html")
    public String loginHtml() {
        return "redirect:/login";
    }

    @GetMapping("/registro")
    public String registro(Model model) {

        model.addAttribute("user", new User());

        return "registro";
    }

    @PostMapping("/registro")
    public String guardar(@ModelAttribute User user) {

        service.register(user);

        return "redirect:/login";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }
}
