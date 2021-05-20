package com.jeonghwa.moment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jeonghwa.moment.model.dao.UserRepository;

import model.domain.User;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepo;
	
	@PostMapping("join") // 가입
	public ModelAndView userJoin(User user) {
		
		userRepo.save(user);
		ModelAndView mv = new ModelAndView();
		mv.addObject("user", user);
		mv.setViewName("index"); // 가입 후 홈으로 이동
		
		return mv;
	}
	
	
}
