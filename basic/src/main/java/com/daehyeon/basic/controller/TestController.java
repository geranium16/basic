package com.daehyeon.basic.controller;
// ������ ��Ʈ�ѷ��� ����� ����
//shift+ctrl+o : ��ü import
//http://localhost:8080/

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//Ŭ���̾�Ʈ ��û�� �������� ��Ʈ�ѷ� �ʼ�!!
//shift+ctrl+o
// ���� ������ ���������� ���⼭ �θ�
@RestController
public class TestController {
	@GetMapping("/test")
	public String test() {
		return "<h1>Hello~</h1>";
	}
}
