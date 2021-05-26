package com.jeonghwa.moment.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.jeonghwa.moment.model.dao.BoardRepository;
import com.jeonghwa.moment.model.dao.UserRepository;

import model.domain.Board;
import model.domain.User;

@SessionAttributes({"user","id"})
@RestController
public class BoardController {
	@Autowired
	   private UserRepository userRepo;
	   @Autowired
	   private BoardRepository boardRepo;
	
	// 글 작성
	@PostMapping("postWrite")
	public ModelAndView postWirte(@RequestParam("title") String title, 
			@RequestParam("content") String content, Board board, @ModelAttribute("id") String id) {
		User user = userRepo.findById(id).get();
		List<Board> posts = new ArrayList<Board>();
		board.setId(user); // 유저 저장
		board.setLiked(0); // 좋아요 0으로 지정
		posts.add(board); // 글 추가
		user.setPosts(posts); //작성자 매치		
		userRepo.save(user); // 글 저장
		System.out.println("글 작성 완료"); 
		return new ModelAndView("board", "boardList", boardRepo.findAll());
	}
	
	// 글 수정
//	@PostMapping("updateWrite")
//	public ModelAndView updateWrite() {
//		
//	}
	
	// 글 삭제
	@PostMapping("deleteWrite")
	public ModelAndView deleteWrite(@RequestParam("id") String id, @RequestParam("title") String title) {
		ModelAndView mv = new ModelAndView();
		
		User user = userRepo.findById(id).get();
		List<Board> posts = new ArrayList<Board>();
		
		return mv;
	}
	
	
}
