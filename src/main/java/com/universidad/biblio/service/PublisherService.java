package com.universidad.biblio.service;

import com.universidad.biblio.model.Publisher;
import com.universidad.biblio.repository.PublisherRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherService {
    private final PublisherRepository repository;

    public PublisherService(PublisherRepository repository) {
        this.repository = repository;
    }

    public List<Publisher> list() {
        return repository.findAll();
    }

    public Publisher find(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Editorial no encontrada"));
    }

    public Publisher save(Publisher publisher) {
        return repository.save(publisher);
    }

    public Publisher update(Long id, Publisher publisher) {
        Publisher current = find(id);
        current.setName(publisher.getName());
        current.setCountry(publisher.getCountry());
        current.setFoundingYear(publisher.getFoundingYear());
        return repository.save(current);
    }

    public void delete(Long id) {
        repository.delete(find(id));
    }
}
