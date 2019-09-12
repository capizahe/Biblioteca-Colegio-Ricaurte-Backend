package com.biblioteca.colegio.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Ubicacion {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@OneToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name = "libro")
	private Libro libro;
	
	private String seccion;
	private Integer numero_estante;
	
	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public Ubicacion() {
		super();
	}
	
	public Ubicacion(Libro libro, String seccion,Integer numero_estante) {
		super();
		this.seccion= seccion;
		this.libro = libro;
		this.numero_estante = numero_estante;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	public Integer getNumero_estante() {
		return numero_estante;
	}
	public void setNumero_estante(Integer numero_estante) {
		this.numero_estante = numero_estante;
	}
	
	

}
