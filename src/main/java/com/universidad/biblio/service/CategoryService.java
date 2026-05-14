package com.universidad.biblio.service;

import com.universidad.biblio.model.Category;
import com.universidad.biblio.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private final CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public List<Category> list() {
        return repository.findAll();
    }

    public Category find(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Categoria no encontrada"));
    }

    public Category save(Category category) {
        return repository.save(category);
    }

    public Category update(Long id, Category category) {
        Category current = find(id);
        current.setName(category.getName());
        current.setDescription(category.getDescription());
        return repository.save(current);
    }

    public void delete(Long id) {
        repository.delete(find(id));
    }
}
