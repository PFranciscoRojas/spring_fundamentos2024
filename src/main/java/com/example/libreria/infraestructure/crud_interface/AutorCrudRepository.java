package com.example.libreria.infraestructure.crud_interface;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.libreria.infraestructure.entity.Autor;

public interface AutorCrudRepository extends CrudRepository<Autor, Integer> {
    List<Autor> findByIdAutor(Long idAutor);
}
