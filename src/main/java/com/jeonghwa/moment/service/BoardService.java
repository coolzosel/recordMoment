package com.jeonghwa.moment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.jeonghwa.moment.model.dao.BoardRepository;

import model.domain.Board;


@Service
public class BoardService {
	
	@Autowired
	private BoardRepository boardRepo;
	
	// 검색
//	public List<Board> search(String keyword, Pageable pageable){		
//		List<Board> boardList = boardRepo.findByTitleContaining(keyword, pageable);		
//		return boardList;
//	}
	
	// 페이징	
	public Page<Board> getBoardList(Pageable pageable){
		return boardRepo.findAll(pageable);
	}
	
	
}
