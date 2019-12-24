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
//	 post��. requestparam���� id , pw �� �Ѿ�°��� ����!! post=����
		String dbId="boot";
		String dbPw="1234";
		if(dbId.equals(id)&&dbPw.equals(pw))
			return "�α��� ����";
	
		return "�α��� ����";
	}
}

//1.�ּ�â�� http://localhost:8080/login �Է��ؼ� get������� login ������ ��
//2.getMapping�鰡�� return -> html/login�� �̵� 
//	