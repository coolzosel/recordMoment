package com.jeonghwa.moment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.jeonghwa.moment.model.dao.BoardRepository;
import com.jeonghwa.moment.model.dao.LikeRepository;
import com.jeonghwa.moment.model.dao.UserRepository;

import model.domain.Board;


@Service
public class BoardService {
	
	@Autowired
	private BoardRepository boardRepo;
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private LikeRepository likeRepo;
	@Autowired
	private BoardService service;
		
	// 페이징	
	public Page<Board> getBoardList(Pageable pageable){
		return boardRepo.findAll(pageable);
	}
	
	
	
}
