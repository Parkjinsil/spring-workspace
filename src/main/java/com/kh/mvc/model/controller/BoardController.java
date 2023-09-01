package com.kh.mvc.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.mvc.model.service.BoardService;
import com.kh.mvc.model.vo.Board;
import com.kh.mvc.model.vo.Criteria;
import com.kh.mvc.model.vo.Paging;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	@GetMapping("/list")
	public void list(Criteria cri, Model model) {
		List<Board> list = service.selectAllBoard(cri);
		model.addAttribute("list", list);
		model.addAttribute("paging", new Paging(cri, service.getTotal()));
	}
	
	@GetMapping("/insert")
	public void insert() {
		
	}
	
	@PostMapping("/insert")
	public String insert(Board board) {
		service.insertBoard(board);
		return "redirect:/board/list";
	}
	
}
