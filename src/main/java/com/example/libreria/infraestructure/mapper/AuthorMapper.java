package com.example.libreria.infraestructure.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;

import com.example.libreria.domain.dto.Author;
import com.example.libreria.infraestructure.entity.Autor;

import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface AuthorMapper {
    @Mappings({
        @Mapping(source = "idAutor", target= "idAuthor"),
        @Mapping(source = "nombre", target= "name"),
        @Mapping(source = "nacionalidad", target= "nacionality"),
    })

    Author toAuthor(Autor autor);
    List<Author> toAuthors(List<Autor> autores);

    @InheritInverseConfiguration
    Autor toAutor(Author author);
    List<Autor> toAutors(List<Author> autors);
}