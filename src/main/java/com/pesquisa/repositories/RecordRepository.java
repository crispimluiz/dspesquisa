package com.pesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long>{
	
}
