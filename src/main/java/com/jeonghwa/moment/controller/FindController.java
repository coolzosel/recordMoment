package com.jeonghwa.moment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jeonghwa.moment.model.dao.UserRepository;

@Controller
public class FindController {
	@Autowired
   private UserRepository userRepo;
	
	//아이디찾기
	@PostMapping("findId")
	public ModelAndView findId(@RequestParam("email") String email) {
		
		ModelAndView mv = new ModelAndView();
		
		try {
			if(userRepo.findById("email").get().getEmail() != null) {
				
				String id = userRepo.findById(email).get().getId();
				mv.addObject("id", id);
				mv.addObject("msg", email+"님의 아이디입니다.");
				System.out.println("아이디 찾기 성공!");
				mv.setViewName("error");
			}
			
		} catch (Exception e) {
			System.out.println("계정 없음");
			System.out.println(email+userRepo.findById(email).get().getEmail());
			mv.addObject("msg", "입력한 이메일이 존재하지 않습니다.");
			mv.setViewName("error");
			
		}
		
		return mv;
	}
	
	
	//비밀번호 찾기
//	@RequestMapping("findPw")
//	public ModelAndView findPw(@RequestParam("id") String id, @RequestParam("email") String email) {
//		ModelAndView mv = new ModelAndView();
//		
//		return mv;
//	}

}
