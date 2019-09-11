package com.biblioteca.colegio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.biblioteca.colegio.model.Login;

@Repository
public interface RepositorioLogin extends CrudRepository<Login,Integer>{

}
