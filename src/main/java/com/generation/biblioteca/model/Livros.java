package com.generation.biblioteca.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_livros")
public class Livros {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private long isbn;
	
	@NotNull
	@Size(min = 2, max = 50)
	private String titulo_livro;
	
	@NotNull
	@Size(min = 2, max = 80)
	private String nome_autor;
	
	@NotNull
	@Size(min = 5, max = 60)
	private String genero;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public String getTitulo_livro() {
		return titulo_livro;
	}

	public void setTitulo_livro(String titulo_livro) {
		this.titulo_livro = titulo_livro;
	}

	public String getNome_autor() {
		return nome_autor;
	}

	public void setNome_autor(String nome_autor) {
		this.nome_autor = nome_autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
}
