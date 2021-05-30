package com.jeonghwa.moment.model.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import model.domain.Board;

public interface BoardRepository extends CrudRepository<Board, Long> {
	
//	List<Board> findByTitleContaining(String keyword);	
	List<Board> findByTitleContaining(String keyword, Pageable pageable);	
		
	Page<Board> findAll(Pageable pageable);
	
}
