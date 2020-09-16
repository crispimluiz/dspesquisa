package com.pesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long>{
	
}
