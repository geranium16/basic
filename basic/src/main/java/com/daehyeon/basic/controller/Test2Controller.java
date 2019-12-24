package com.daehyeon.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



// 따로 파일을 만들어서 불러드림
@Controller
public class Test2Controller {
	@GetMapping("/test2")
	public String test2() {
		return "hello";
	}
}
