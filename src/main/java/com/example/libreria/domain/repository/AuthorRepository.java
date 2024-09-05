package com.example.libreria.domain.repository;

import java.util.List;

import com.example.libreria.domain.dto.Author;

public interface AuthorRepository {
    List<Author> getAll();
}
