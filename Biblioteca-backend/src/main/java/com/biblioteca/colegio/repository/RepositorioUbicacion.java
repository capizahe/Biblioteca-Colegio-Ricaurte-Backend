package com.biblioteca.colegio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.biblioteca.colegio.model.Ubicacion;

@Repository
public interface RepositorioUbicacion extends CrudRepository<Ubicacion,Integer> {

}
