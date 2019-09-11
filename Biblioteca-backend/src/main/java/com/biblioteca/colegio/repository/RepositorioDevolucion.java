package com.biblioteca.colegio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.biblioteca.colegio.model.Devolucion;

@Repository
public interface RepositorioDevolucion extends CrudRepository<Devolucion, Integer>{

}
