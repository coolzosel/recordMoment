package com.jeonghwa.moment.model.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import model.domain.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
		
	Page<Board> findAll(Pageable pageable);
	Page<Board> findByTitleContaining(String keyword, Pageable pageable);
	
	
}
