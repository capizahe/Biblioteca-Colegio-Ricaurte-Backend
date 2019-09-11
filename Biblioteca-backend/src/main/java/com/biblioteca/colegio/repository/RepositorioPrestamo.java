package com.biblioteca.colegio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.biblioteca.colegio.model.Prestamo;

@Repository
public interface RepositorioPrestamo extends CrudRepository<Prestamo,Integer> {

}
