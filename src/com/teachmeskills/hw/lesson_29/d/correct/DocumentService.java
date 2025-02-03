package com.teachmeskills.hw.lesson_29.d.correct;

public class DocumentService {

    private final DocumentRepository repository;

    DocumentService(DocumentRepository repository) {
        this.repository = repository;
    }

    void save(String data) {
        repository.save(data);
    }
}
