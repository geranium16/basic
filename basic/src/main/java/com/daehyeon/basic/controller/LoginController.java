package com.daehyeon.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
	@GetMapping("/login")
	public String login() {
		return "html/login";
	}

	@PostMapping("/login")
	@ResponseBody
	public String loginPost(
			@RequestParam("id")String id,
			@RequestParam("pw")String pw) {
//	 post다. requestparam으로 id , pw 에 넘어온것을 저장!! post=저장
		String dbId="boot";
		String dbPw="1234";
		if(dbId.equals(id)&&dbPw.equals(pw))
			return "로그인 성공";
	
		return "로그인 실패";
	}
}

//1.주소창에 http://localhost:8080/login 입력해서 get방식으로 login 페이지 ㄱ
//2.getMapping들가서 return -> html/login로 이동 
//	