package com.universidad.biblio.model;

public class Permission {
    private String name;
    private String description;
    private String role;

    public Permission() {
    }

    public Permission(String name, String description, String role) {
        this.name = name;
        this.description = description;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
