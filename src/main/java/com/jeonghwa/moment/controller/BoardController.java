package com.jeonghwa.moment.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.jeonghwa.moment.model.dao.BoardRepository;
import com.jeonghwa.moment.model.dao.UserRepository;
import com.jeonghwa.moment.service.BoardService;

import model.domain.Board;
import model.domain.User;

@SessionAttributes({"user","id"})
@RestController
public class BoardController {
	@Autowired
	   private UserRepository userRepo;
	   @Autowired
	   private BoardRepository boardRepo;
	   
	   @Autowired
	   private BoardService service;
	   
	   
	   
	// 게시판 페이지 
	@GetMapping("board")
	public ModelAndView index(@PageableDefault(size=10, sort="no", 
	direction=Sort.Direction.DESC) Pageable pageable) {
		
		ModelAndView mv = new ModelAndView("board");		
		Page<Board> blist = service.getBoardList(pageable);
		
		int pageNo = blist.getPageable().getPageNumber(); // 현재페이지
		int totalPages = blist.getTotalPages(); // 총페이지
		int pageBlock = 3; // 페이지네이션 블럭
		int startBlockPage = ((pageNo)/pageBlock*pageBlock+1);
		int endBlockPage = startBlockPage + pageBlock - 1;
		endBlockPage = totalPages < endBlockPage ? totalPages : endBlockPage; 
		
		mv.addObject("startbp", startBlockPage);
		mv.addObject("endbp", endBlockPage);
		mv.addObject("boardList", blist);
		
		return mv;
	}
	
	
	// 글 작성
	@PostMapping("postWrite")
	public ModelAndView postWirte(@RequestParam("title") String title, 
			@RequestParam("content") String content, Board board, @ModelAttribute("id") String id,
			@PageableDefault(size=10, sort="no", direction=Sort.Direction.DESC) Pageable pageable) {
		
		ModelAndView mv = new ModelAndView("board");
		User user = userRepo.findById(id).get();
		List<Board> posts = new ArrayList<Board>();
		
		board.setId(user); // 유저 저장
		posts.add(board); // 글 추가
		user.setPosts(posts); // 작성자 매치		
		userRepo.save(user); // 글 저장
		System.out.println("글 작성 완료"); 
		
		Page<Board> blist = service.getBoardList(pageable);
		
		int pageNo = blist.getPageable().getPageNumber(); // 현재페이지
		int totalPages = blist.getTotalPages(); // 총페이지
		int pageBlock = 3; // 페이지네이션 블럭
		int startBlockPage = ((pageNo)/pageBlock*pageBlock+1);
		int endBlockPage = startBlockPage + pageBlock - 1;
		endBlockPage = totalPages < endBlockPage ? totalPages : endBlockPage; 
		
		mv.addObject("startbp", startBlockPage);
		mv.addObject("endbp", endBlockPage);
		mv.addObject("boardList", blist);
		
		return mv;
	}
	
	
	// 글 조회
	@GetMapping("/board/{no}")
	public ModelAndView readPost(@PathVariable("no") Long no) {
		Board post = boardRepo.findById(no).get();
		ModelAndView mv = new ModelAndView("detailView");
		mv.addObject("post", post);		
		return mv;
	}
	
	
	// 글 수정
	@PostMapping("/update/{no}")
	public ModelAndView updatePost(@PathVariable("no") Long no, Board board, 
			@PageableDefault(size=10, sort="no", direction=Sort.Direction.DESC) Pageable pageable) {
				
		System.out.println("글 수정 완료!");
		boardRepo.findById(no).map(oldBoard -> {
			oldBoard.setTitle(board.getTitle());
			oldBoard.setContent(board.getContent());
			return boardRepo.save(oldBoard);
		}).orElseGet(() -> {			
			board.setNo(no);
			return boardRepo.save(board);
		});
		
		ModelAndView mv = new ModelAndView("board");
		Page<Board> blist = service.getBoardList(pageable);
		int pageNo = blist.getPageable().getPageNumber();
		int totalPages = blist.getTotalPages();
		int pageBlock = 3; 
		int startBlockPage = ((pageNo)/pageBlock*pageBlock+1);
		int endBlockPage = startBlockPage + pageBlock - 1;
		endBlockPage = totalPages < endBlockPage ? totalPages : endBlockPage; 
		
		mv.addObject("startbp", startBlockPage);
		mv.addObject("endbp", endBlockPage);
		mv.addObject("boardList", blist);
				
		return mv;
		
	}
	
	
	// 글 검색
	@GetMapping("/search")
	public ModelAndView search(@RequestParam(required = false, defaultValue = "") String keyword, 
			@PageableDefault(size=10, sort="no", direction=Sort.Direction.DESC) Pageable pageable) {
		
		System.out.println("검색: "+keyword);
		ModelAndView mv = new ModelAndView("search");
		Page<Board> blist = service.getBoardList(pageable);
		blist = boardRepo.findByTitleContaining(keyword, pageable);
		
		int pageNo = blist.getPageable().getPageNumber();
		int totalPages = blist.getTotalPages();
		int pageBlock = 3;
		int startBlockPage = ((pageNo)/pageBlock*pageBlock+1);
		int endBlockPage = startBlockPage + pageBlock - 1;
		endBlockPage = totalPages < endBlockPage ? totalPages : endBlockPage; 
		
		mv.addObject("startbp", startBlockPage);
		mv.addObject("endbp", endBlockPage);
		mv.addObject("boardList", blist);
				
		return mv;
		
	}
	
	
	
	
}
