package com.teachmeskills.hw.lesson_29.d.wrong;

public class DocumentService {

    private final MySqlRepository repository = new MySqlRepository();

    void save(String data) {
        repository.save(data);
    }
}
