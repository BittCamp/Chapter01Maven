package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController //웹으로 연결. 웹사이트에 바로 연결해버림. 리스폰스 바디 안써줘도 됨. 컨트롤러 역할도 하면서 ResponseBody역할 웹으로 연결하는 역할도 한다.
public class HelloController {
	
	public HelloController() {
		System.out.println("HelloController 기본 생성자");
	}
	
	@GetMapping(value="hello")
	//@ResponseBody
	public String hello(String name) {
		return "안녕하세요" + name+ "님!!";
	}
}
