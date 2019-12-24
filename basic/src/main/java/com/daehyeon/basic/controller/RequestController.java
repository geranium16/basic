package com.daehyeon.basic.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.daehyeon.basic.model.Member;

@RestController
public class RequestController {


	@GetMapping("req/http")
	public String http(HttpServletRequest request) {
		String name = request.getParameter("name");
		String pageNum = request.getParameter("pageNum");
		return name + ", " + pageNum;
	}

	@GetMapping("req/param1")
	public String param1(@RequestParam("key1") String key1, @RequestParam("key2") String key2) {
		return key1 + ", " + key2;
	}

//	http://localhost:8080/req/param1?key1=a&key2=1 써야 나온다.
//	갯수를 맞춰야한다.
	@GetMapping("req/param2")
	public String param2(@RequestParam Map<String, Object> map) {
		return map.toString();
	}
// 몇개를 넘기던 상관없이 다 넘어감

// member.java에 선언된 객체 변수만 가능
//	http://localhost:8080/req/model?name=11&userId=22&userPassword=33
	@GetMapping("req/model")
	public String model(@ModelAttribute Member member) {
		return member.toString();
	}
	@GetMapping("req/path/{path1}/{path2}")
	public String path(@PathVariable("path1") String path1, @PathVariable("path2") String path2) {
		return path1 + ", " + path2;
	}
}
