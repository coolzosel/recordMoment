package com.jeonghwa.moment.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jeonghwa.moment.model.dao.LikeRepository;
import com.jeonghwa.moment.model.dao.UserRepository;
import com.jeonghwa.moment.service.BoardService;

@Controller
public class LikeController {
	
	@Autowired
	private LikeRepository likeRepo;
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private BoardService service;
		
	
}
