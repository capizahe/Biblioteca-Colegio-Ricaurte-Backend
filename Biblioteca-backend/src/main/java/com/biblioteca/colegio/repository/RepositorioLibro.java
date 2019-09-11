package com.biblioteca.colegio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.biblioteca.colegio.model.Libro;

@Repository
public interface RepositorioLibro extends CrudRepository<Libro,Integer>{

	public Iterable<Libro> getAllLibroByAutor(String autor);
}
