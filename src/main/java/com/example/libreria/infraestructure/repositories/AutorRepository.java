package com.example.libreria.infraestructure.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.libreria.domain.dto.Author;
import com.example.libreria.domain.repository.AuthorRepository;
import com.example.libreria.infraestructure.crud_interface.AutorCrudRepository;
import com.example.libreria.infraestructure.entity.Autor;
import com.example.libreria.infraestructure.mapper.AuthorMapper;

@Repository
public class AutorRepository implements AuthorRepository  {

    @Autowired
    private AutorCrudRepository autorRepository;
    
    @Autowired
    private AuthorMapper mapper;

    @Override
    public List<Author> getAll() {
        List<Autor> autores = (List<Autor>) autorRepository.findAll();
        return mapper.toAuthors(autores);
    }

  
    
}
