package com.jeonghwa.moment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.jeonghwa.moment.model.dao.BoardRepository;
import com.jeonghwa.moment.model.dao.UserRepository;

import model.domain.Board;


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
	
	@GetMapping("writePage") // 게시글 작성 페이지
	public String writePage() {
		return "write";
	}
	
	@GetMapping("/update/{no}") // 게시글 수정 페이지
	public ModelAndView updatePage(@PathVariable("no") Long no) {
		System.out.println("수정 페이지로 이동");
		Board post = boardRepo.findById(no).get();
		ModelAndView mv = new ModelAndView("update");
		mv.addObject("post", post);
		return mv;
	}
	
}
