package com.jeonghwa.moment.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.jeonghwa.moment.model.dao.BoardRepository;
import com.jeonghwa.moment.model.dao.UserRepository;
import com.jeonghwa.moment.service.BoardService;

import model.domain.Board;
import model.domain.User;

@SessionAttributes({"user","id"})
@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private BoardRepository boardRepo;
	@Autowired
	private BoardService service;
	
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
	
	
	// 로그인	
	@RequestMapping("login")
	public ModelAndView userLogin(Model model, @RequestParam("id") String id, @RequestParam("pw") String pw, HttpSession session, @PageableDefault(size=10, sort="no", 
			direction=Sort.Direction.DESC) Pageable pageable) {
		ModelAndView mv = new ModelAndView();
		
		try {
			if(userRepo.findById(id) != null && userRepo.findById(id).get().getPw().equals(pw)) {
				session.setAttribute("id", id);
				model.addAttribute("id", id);
				
				Page<Board> blist = service.getBoardList(pageable);				
				int pageNo = blist.getPageable().getPageNumber();
				int totalPages = blist.getTotalPages(); 
				int pageBlock = 3; 
				int startBlockPage = ((pageNo)/pageBlock*pageBlock+1);
				int endBlockPage = startBlockPage + pageBlock - 1;
				endBlockPage = totalPages < endBlockPage ? totalPages : endBlockPage; 
								
				mv.addObject("startbp", startBlockPage);
				mv.addObject("endbp", endBlockPage);
				mv.addObject("boardList", service.getBoardList(pageable));

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
	
	// 로그아웃
	@GetMapping("logout")
	public ModelAndView logout(@ModelAttribute("id") String id, SessionStatus status, HttpSession session) {
		System.out.println("로그아웃 성공");
		ModelAndView mv = new ModelAndView();
		System.out.println("세션: "+session.getAttribute("id")); // 세션: test1
		status.setComplete();
		session.removeAttribute("id");
		System.out.println("세션: "+session.getAttribute("id")); // 세션: null
		mv.setViewName("index");
		return mv;
	}
	
}

	// 회원 탈퇴
	

