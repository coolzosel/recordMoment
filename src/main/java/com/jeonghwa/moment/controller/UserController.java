package com.jeonghwa.moment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jeonghwa.moment.model.dao.UserRepository;

import model.domain.User;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepo;
	
	//가입
	@PostMapping("join")
	public ModelAndView userJoin(User user) {
		
		userRepo.save(user);
		ModelAndView mv = new ModelAndView();
		mv.addObject("user", user);
		mv.setViewName("index"); // 가입 후 홈으로 이동
		
		return mv;
	}
	
	//탈퇴
	
	// 로그잇 - 세션 겟, 
	// 로그인
//	@RequestMapping
//	public ModelAndView userLogin(User user) {
//		
//	}
	
	// 로그아웃 - 세션 날리기, 초기화
	
	
}
