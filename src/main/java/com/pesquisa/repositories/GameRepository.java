package com.pesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
}
