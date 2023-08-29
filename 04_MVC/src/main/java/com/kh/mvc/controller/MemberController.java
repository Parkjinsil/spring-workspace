package com.kh.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.mvc.model.service.MemberService;
import com.kh.mvc.model.vo.Member;

@Controller
public class MemberController {

	@Autowired
	private MemberService service;
	
	// <검색>
	// 단순 이동
	@RequestMapping("search")
	public String search() {
		return "search"; // -> sevlecontext에 "/WEB-INF/views/"뒷부분에 search가 붙어서 그 경로로 가짐
	}
	
	// 비즈니스 로직
	@RequestMapping("find")
	public String find(String keyword, Model model) {
		// getParameter 부분이 필요가 없음
		// System.out.println(keyword); 
		// 서비스 - 비즈니스 로직 처리!
		// --> list 값! 데이터 바인딩 -> Model!
		// model.addAttribute("list", list);
		return "find_ok"; // 없으면 "find_fail"
	}
	
	// <회원가입>
	// 페이지 이동
	@RequestMapping("register")
	public String register() {
		return "register";
	}
	
	// 비즈니스 로직 처리
	@RequestMapping("singUp")
	public String signUp(Member member) {
		//비즈니스 로직
		// register.jsp에서 name값이랑 필드명 맞추라 했던 이유는 getParameter 없이 그냥 Member로 받을 수 있어서
		System.out.println(member);
		service.registerMember(member);
		
		return "redirect:/"; // index.jsp로 넘길 때
	}
	
	// login - 페이지 이동
	@RequestMapping("login")
	public String login() {
		return "login";
	}
	
	// signIn - 비즈니스 로직 포함 : 파라미터 값 -> HttpServletRequest request
	// -> return "login_result"
	@RequestMapping("signIn")
	public String singIn(HttpServletRequest request) {
		String id= request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		Member member = new Member();
		member.setId(id);
		member.setPwd(pwd);
		
		Member vo = new Member();
		vo = service.login(member);
		
		HttpSession session = request.getSession();
		
		if(vo!=null) {
			session.setAttribute("vo", vo);
		}
		
		return "login_result";
	}
	
	// allMember - 비즈니스 로직 포함, 데이터바인딩 - Model
	// --> return "find_ok";
	@RequestMapping("allMember")
	public String allMember(Model model) {
		
		List<Member> list = service.showAllMember();
		model.addAttribute("list", list);
		
		return "find_ok";
	}
	
	// logout - 로그아웃 기능!
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		
		if(session.getAttribute("vo")!=null) {
			session.invalidate();
		}
		return "redirect:/";
	}
	
	// update - 페이지 이동
	@RequestMapping("update")
	public String update() {
		return "update";
	}
	
	// updateMember - 비즈니스 로직 포함 -> 파라미터 request 필요
	@RequestMapping("updateMember")
	public String updateMember(HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		
		
		
	}
}


















