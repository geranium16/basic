package com.daehyeon.basic.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ThymeleafController {
	@GetMapping("user")
	public String user(Model model) {
		Map<String, Object> user = null;
		user = new HashMap<>();
		user.put("userId", "z");
		user.put("userName", "zoo");
		user.put("userAge", 25);
		model.addAttribute("user", user);
		return "html/user";
	}

	@GetMapping("userhtml")
	public String userList(Model model) {
		List<Map<String, Object>> userList = new ArrayList<>();
		Map<String, Object> user = null;
		user = new HashMap<>();
		user.put("userId", "a");
		user.put("userName", "apple");
		user.put("userAge", 21);
		userList.add(user);
		user = new HashMap<>();
		user.put("userId", "b");
		user.put("userName", "banana");
		user.put("userAge", 22);
		userList.add(user);
		user = new HashMap<>();
		user.put("userId", "c");
		user.put("userName", "carrot");
		user.put("userAge", 23);
		userList.add(user);
		model.addAttribute("userList", userList);
		return "html/userhtml";
	}

	@GetMapping("mode")
	public String mode(Model model, @RequestParam Map<String, Object> map) {
		model.addAttribute("name", map.get("name"));
		model.addAttribute("auth", map.get("auth"));
		model.addAttribute("category", map.get("category"));
		return "html/mode";
	}
// http://localhost:8080/pagination?page=2 -->requestparam역활
//	모델을 안쓰면  어떤수를 쓰던 1~10만 나온다. 정적
//	모델을 쓰면 동적 1~10 10~20
	@GetMapping("pagination")
	public String pagination(Model model, @RequestParam(defaultValue = "1") int page) {
		int startPage = (page - 1) / 10 * 10 + 1;
		int endPage = startPage + 9;
		model.addAttribute("startPage", startPage);
		model.addAttribute("endPage", endPage);
		model.addAttribute("page", page);
		return "html/pagination";
	}
	@GetMapping("/linkUrl")
	public String linkUrl(Model model, @RequestParam int now_page) {
		int start=(now_page-1)/10*10+1;
		int end=start+9;
		model.addAttribute("start",start);
		model.addAttribute("end",end);
		model.addAttribute("now_page",now_page);
		return "linkUrl";
	}
	
}