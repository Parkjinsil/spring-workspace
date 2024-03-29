package com.kh.mvc.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.mvc.model.dao.BoardDAO;
import com.kh.mvc.model.vo.Board;
import com.kh.mvc.model.vo.Criteria;

@Service
public class BoardService {
	
	@Autowired
	private BoardDAO dao;
	
	public int insertBoard(Board board) {
		return dao.insertBoard(board);
	}
	
	public List<Board> selectAllBoard(Criteria cri) {
		return dao.selectAllBoard(cri);
	}
	
	public int getTotal() {
		return dao.getTotal();
	}
	
}
