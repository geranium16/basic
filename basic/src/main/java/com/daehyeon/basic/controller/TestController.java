package com.daehyeon.basic.controller;
// 서버에 컨트롤러를 만드는 과정
//shift+ctrl+o : 전체 import
//http://localhost:8080/

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//클라이언트 요청을 받이위한 컨트롤러 필수!!
//shift+ctrl+o
// 따로 파일을 만들지말고 여기서 부름
@RestController
public class TestController {
	@GetMapping("/test")
	public String test() {
		return "<h1>Hello~</h1>";
	}
}
