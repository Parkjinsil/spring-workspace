package com.kh.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 아래 애노테이션 쓰려면 poem.xml에 롬복부분 써줘야함
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

	private String name;
	private String message;
	
}
