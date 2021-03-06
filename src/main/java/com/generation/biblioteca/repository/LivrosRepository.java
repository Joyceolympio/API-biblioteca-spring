package com.generation.biblioteca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.biblioteca.model.Livros;

@Repository
public interface LivrosRepository extends JpaRepository<Livros, Long> {
	public List<Livros> findAllByTituloContainingIgnoreCase(String titulo_livro);
}
