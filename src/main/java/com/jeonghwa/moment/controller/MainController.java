package com.jeonghwa.moment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
//	@GetMapping("index") // 홈
//	public String home() {
//		return "index";
//	}
	
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
	
}
