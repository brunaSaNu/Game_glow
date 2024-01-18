package com.generation.gameGlow.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.gameGlow.model.Jogo;

public interface JogoRepository extends JpaRepository<Jogo, Long> {
	
	public List<Jogo> findAllByGameNameContainingIgnoreCase(@Param("gameName") String gameName);

}
