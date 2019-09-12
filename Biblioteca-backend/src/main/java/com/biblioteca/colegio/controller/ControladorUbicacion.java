package com.biblioteca.colegio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.colegio.model.Libro;
import com.biblioteca.colegio.model.Ubicacion;
import com.biblioteca.colegio.repository.RepositorioLibro;
import com.biblioteca.colegio.repository.RepositorioUbicacion;

@RestController
@RequestMapping(path = "/ubicacion")
public class ControladorUbicacion {

	@Autowired
	private RepositorioUbicacion repositorioUbicacionDao;
	
	@Autowired
	private RepositorioLibro repositorioLibroDao;
	
	@GetMapping(path="/verUbicaciones")
	public Iterable<Ubicacion> verUbicaciones(){
		return repositorioUbicacionDao.findAll();
	}
	
	@PostMapping(path="/verUbicacionesPorSeccion")
	public Iterable<Ubicacion> verUbicacionesPorSeccion(@RequestParam String seccion){
		return repositorioUbicacionDao.findAllBySeccion(seccion);
	}
	
	@PostMapping("/agregarUbicacion")
	public @ResponseBody String agregarUbicacion(@RequestParam String libro, @RequestParam String seccion,  @RequestParam String numero_estante) {
		Libro libro_ = repositorioLibroDao.getLibroByTitulo(libro);
		repositorioUbicacionDao.save(new Ubicacion(libro_, seccion ,Integer.parseInt(numero_estante)));
		return "El libro <"+libro+"> fue ubicado en <"+numero_estante+","+seccion+"> satisfactoriamente";
	}
	@PostMapping("/ubicacionPorLibro")
	public @ResponseBody Ubicacion ubicacionPorLibro(@RequestParam String libro) {
		Ubicacion ubicacion = repositorioUbicacionDao.getUbicacionByLibro(repositorioLibroDao.getLibroByTitulo(libro));
		return ubicacion;
	}
}
