package com.example.libreria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.libreria.domain.dto.Author;
import com.example.libreria.domain.service.AuthorService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/authors")
public class AuthorController {
    
    @Autowired
    private AuthorService authorService;

    @GetMapping("/all")
    public List<Author> getAll(){
        return authorService.getAll();
    }
}
