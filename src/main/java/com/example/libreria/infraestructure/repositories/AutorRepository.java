package com.example.libreria.infraestructure.repositories;

import java.util.List;

import com.example.libreria.domain.dto.Author;
import com.example.libreria.domain.repository.AuthorRepository;
import com.example.libreria.infraestructure.crud_interface.AutorCrudRepository;
import com.example.libreria.infraestructure.entity.Autor;
import com.example.libreria.infraestructure.mapper.AuthorMapper;

public class AutorRepository implements AuthorRepository {
    
    private AutorCrudRepository autorRepository;
    private AuthorMapper mapper;

    public List<Author> getAll(){
        List<Autor> autors = (List<Autor>) autorRepository.findAll();
        return mapper.toAuthors(autors);
    }

    @Override
    public Author save(Author author) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public String delete(Author author) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public Author findAuthor(int idAuthor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAuthor'");
    }
    
}
