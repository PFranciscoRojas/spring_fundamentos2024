package com.example.libreria.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.libreria.domain.dto.Author;
import com.example.libreria.domain.repository.AuthorRepository;

@Service
public class AuthorService {
    
    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> getAll(){
        return authorRepository.getAll();
    }

}
