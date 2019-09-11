package com.biblioteca.colegio.model;

import java.util.Date;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Libro {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String titulo;
	private String editorial;
	private String autor;
	private Date fecha_registro;
	private String genero;
	
	public Libro() {
		
	}
	
	public Libro(String titulo, String editorial, String autor, String genero) {
		super();
		this.titulo = titulo;
		this.editorial = editorial;
		this.autor = autor;
		this.fecha_registro = new  java.sql.Date(Calendar.getInstance().getTime().getTime());
		this.genero = genero;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Date getFecha_registro() {
		return fecha_registro;
	}
	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

	
	
}
