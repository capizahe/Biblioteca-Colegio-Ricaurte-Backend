package com.biblioteca.colegio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.biblioteca.colegio.model.Rol;

@Repository
public interface RepositorioRol extends CrudRepository<Rol,Integer> {

}
