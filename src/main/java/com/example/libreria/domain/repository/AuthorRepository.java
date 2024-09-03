package com.example.libreria.domain.repository;

import java.util.List;

import com.example.libreria.domain.dto.Author;

public interface AuthorRepository {
    Author save(Author author);
    void delete(Long author);
    List<Author> getAll();
    Author findAuthor(int idAuthor);
}
