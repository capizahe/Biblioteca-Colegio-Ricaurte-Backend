package com.biblioteca.colegio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.biblioteca.colegio.model.Usuario;

@Repository
public interface RepositorioUsuario  extends CrudRepository<Usuario,Integer>{
	
}
