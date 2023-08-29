package com.kh.character;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Character {
	
	private String name;
	private int level;
	private Weapon weapon;
	
	public String quest(String questName) throws Exception {
		System.out.println(questName + "퀘스트 진행 중..");
		return questName + "퀘스트 진행 중";
	}
	
	@Around("execution(* com.kh.character.Weapon.arrack())")
	public String attackAdvice(ProceedingJoinPoint jp) {
		String result = null;
		return result;
	}
	
}
