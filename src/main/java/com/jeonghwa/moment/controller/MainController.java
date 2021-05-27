package com.jeonghwa.moment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jeonghwa.moment.model.dao.BoardRepository;
import com.jeonghwa.moment.model.dao.UserRepository;

@Controller
public class MainController {
	
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private BoardRepository boardRepo;
	
//	@GetMapping("index") // 홈
//	public String home() {
//		return "index";
//	} 홈으로 가지는거, 세션이 널이라면 가지게 하고, 널이 아니면 게시판페이지로 가지게끔
	
	@GetMapping("joinPage") // 가입 페이지
	public String joinPage() {
		return "join";
	}
	
	@GetMapping("loginPage") // 로그인 페이지
	public String test() {
		System.out.println("loginPage()");
		return "login";
	}
	
	
	@GetMapping("findIdPage") // 아이디찾기 페이지
	public String findIdPage() {
		return "findId";
	}
	
	@GetMapping("findPwPage") // 비밀번호찾기 페이지
	public String findPwPage() {
		return "findPw";
	}
	
	@GetMapping("board")
	public ModelAndView board() { // 게시판 페이지
		ModelAndView mv = new ModelAndView();
		mv.addObject("boardList", boardRepo.findAll());
		mv.setViewName("board");
		System.out.println("게시판목록으로 가기");
		return mv;
	}
	
	@GetMapping("writePage") // 게시글 작성 페이지
	public String writePage() {
		return "write";
	}
	
}
