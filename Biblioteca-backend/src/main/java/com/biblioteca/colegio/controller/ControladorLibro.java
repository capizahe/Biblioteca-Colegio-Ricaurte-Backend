package com.biblioteca.colegio.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.biblioteca.colegio.model.Libro;
import com.biblioteca.colegio.repository.RepositorioLibro;

@RestController
@RequestMapping(path="/libros")
public class ControladorLibro {

	@Autowired
	private RepositorioLibro repositorioLibroDao;
	
	@GetMapping(path="/verLibros")
	public Iterable<Libro> verLibros(){
		
		return repositorioLibroDao.findAll();
	}
	@PostMapping(path="/agregarLibro")
	public @ResponseBody String agregarLibro(@RequestParam String titulo, @RequestParam String editorial, @RequestParam String autor, @RequestParam String genero) {
		Libro libro = new Libro(titulo, editorial, autor, genero);
		repositorioLibroDao.save(libro);
		return "Libro <"+libro.getTitulo()+"> guardado satisfactoriamente";
	}
	
	@GetMapping(path="/verLibrosPorAutor")
	public Iterable<Libro> verLibrosPorAutor(@RequestParam String autor) {
		return repositorioLibroDao.getAllLibroByAutor(autor);
	}
	
	@GetMapping(path="/verLibrosPorGenero")
	public Iterable<Libro> verLibrosPorGenero(@RequestParam String genero) {
		return repositorioLibroDao.getAllLibroByGenero(genero);
	}
	
	@GetMapping(path="/verLibrosPorEditorial")
	public Iterable<Libro> verLibrosPorEditorial(@RequestParam String editorial) {
		return repositorioLibroDao.getAllLibroByEditorial(editorial);
	}
	
	@PostMapping(path="/eliminarLibroPorTitulo")
	public String eliminarLibroPorTitulo(@RequestParam String titulo) {
		Libro libro = repositorioLibroDao.getLibroByTitulo(titulo);
		repositorioLibroDao.delete(libro);
		
		return "Libro/s <"+titulo+"> eliminado/s satisfactoriamente";
	}
	
	
	
	
	
}
