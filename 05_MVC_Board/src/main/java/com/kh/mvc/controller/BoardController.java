package com.kh.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.mvc.model.service.BoardService;
import com.kh.mvc.model.vo.Board;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	@Autowired
	private BoardService service;
	
//	@RequestMapping(value="/list", method=RequestMethod.GET) 
//  위랑 아래랑 같은 뜻
	@GetMapping("/list")
	public void list (Model model) {
		List<Board> list = service.selectAllBoard();
		model.addAttribute("list", list);
	}
	
	@PostMapping("/list")
	
	@PutMapping
	
	@DeleteMapping
	
	@RequestMapping("/insert")
	public void insert() {
		
	}
	
}





















