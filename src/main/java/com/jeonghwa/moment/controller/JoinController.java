package com.jeonghwa.moment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jeonghwa.moment.model.dao.UserRepository;

import model.domain.User;

@Controller
public class JoinController {

	@Autowired
	private UserRepository userRepo;

//회원가입
//	@PostMapping("join")
//	public ModelAndView userInsert(User user) {
//		
//		userRepo.save(user);
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("user", user);
//		mv.setViewName("index");
//		
//		return mv;
//		
//	}
	
	
	
	
}
