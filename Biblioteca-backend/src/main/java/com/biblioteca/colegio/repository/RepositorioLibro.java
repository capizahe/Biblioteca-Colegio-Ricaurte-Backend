package com.biblioteca.colegio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.biblioteca.colegio.model.Libro;

@Repository
public interface RepositorioLibro extends CrudRepository<Libro,Integer>{

	public Iterable<Libro> getAllLibroByAutor(String autor);
	public Libro getLibroByTitulo(String titulo);
	public Iterable<Libro> getAllLibroByGenero(String genero);
	public Iterable<Libro> getAllLibroByEditorial(String editorial);

}
