package com.universidad.biblio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping({"/admin/books", "/admin/books/edit"})
    public String books() {
        return "admin/books";
    }

    @GetMapping({"/admin/authors", "/admin/authors/edit"})
    public String authors() {
        return "admin/authors";
    }

    @GetMapping({"/admin/categories", "/admin/categories/edit"})
    public String categories() {
        return "admin/categories";
    }

    @GetMapping({"/admin/publishers", "/admin/publishers/edit"})
    public String publishers() {
        return "admin/publishers";
    }

    @GetMapping({"/admin/loans", "/admin/loans/extend"})
    public String loans() {
        return "admin/loans";
    }

    @GetMapping("/admin/orders")
    public String orders() {
        return "admin/orders";
    }

    @GetMapping("/admin/fines")
    public String fines() {
        return "admin/fines";
    }

    @GetMapping({"/admin/users", "/admin/users/edit"})
    public String users() {
        return "admin/users";
    }

    @GetMapping("/admin/reviews")
    public String reviews() {
        return "admin/reviews";
    }

    @GetMapping("/admin/notifications")
    public String notifications() {
        return "admin/notifications";
    }

    @GetMapping("/admin/reports")
    public String reports() {
        return "admin/reports";
    }

    @GetMapping("/admin/permissions")
    public String permissions() {
        return "admin/permissions";
    }

    @GetMapping("/admin/audit-logs")
    public String auditLogs() {
        return "admin/audit-logs";
    }

    @GetMapping("/reader/catalog")
    public String catalog() {
        return "reader/catalog";
    }

    @GetMapping("/reader/loans")
    public String readerLoans() {
        return "reader/loans";
    }

    @GetMapping("/reader/orders")
    public String readerOrders() {
        return "reader/orders";
    }

    @GetMapping("/reader/fines")
    public String readerFines() {
        return "reader/fines";
    }

    @GetMapping("/reader/notifications")
    public String readerNotifications() {
        return "reader/notifications";
    }

    @GetMapping("/reader/reviews/new")
    public String newReview() {
        return "reader/review-form";
    }
}
