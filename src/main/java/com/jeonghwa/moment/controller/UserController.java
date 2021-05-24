package com.jeonghwa.moment.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.jeonghwa.moment.model.dao.UserRepository;

import model.domain.User;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepo;

	@Autowired
	private HttpSession session;

	
	//가입
	@PostMapping("join")
	public ModelAndView userJoin(User user) {
		
		userRepo.save(user);
		ModelAndView mv = new ModelAndView();
		mv.addObject("user", user);
		mv.setViewName("index"); // 가입 후 홈으로 이동
		
		return mv;
	}
	
	
	//아이디 중복체크
//	@PostMapping("idChk2")
//	public String idChk2(@RequestParam String id) {
//		try {
//			if (userRepo.existsById(id)) {
//				session.setAttribute("msg", "이미 존재하는 아이디입니다. 다시 시도해주세요!");
//				return "redirect:msg.html";
//			} else {
//				session.setAttribute("msg", "사용 가능한 아이디입니다.");				
//			}			
//		} catch (Exception e) {
//			e.printStackTrace();
//			return new ModelAndView("index");
//		}		
//	}
	
	//아이디 중복 체크
//	@GetMapping("idChk")
//	public ModelAndView idChk(@ModelAttribute("id") String id, SessionStatus status, HttpSession session) {
//		System.out.println("중복체크 확인");
//		ModelAndView mv = new ModelAndView();
//		System.out.println("세션-"+session.getAttribute("id"));
//		
//		
//	}
	
	
	//탈퇴
	
	// 로그잇 - 세션 겟, 
	// 로그인	
	@RequestMapping("login")
	public ModelAndView userLogin(Model model, @RequestParam("id") String id, @RequestParam("pw") String pw, HttpSession session) {
		ModelAndView mv = new ModelAndView();
		
		try {
			if(userRepo.findById(id) != null && userRepo.findById(id).get().getPw().equals(pw)) {
				session.setAttribute("id", id);
				model.addAttribute("id", id);
				System.out.println("로그인 성공");
				mv.setViewName("board");
			}else {
				System.out.println("로그인 실패");
				mv.addObject("msg", "비밀번호가 일치하지 않습니다. 다시 시도하세요!");
				mv.setViewName("error");
			}
		} catch (Exception e) {
			System.out.println("로그인 실패");
			mv.addObject("msg", "입력한 계정이 존재하지 않습니다.");
			mv.setViewName("error");
		}
		return mv;
	}
	
	// 로그아웃 - 세션 날리기, 초기화
	
	
}
