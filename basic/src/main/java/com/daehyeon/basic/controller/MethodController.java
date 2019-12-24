package com.daehyeon.basic.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MethodController {
	@GetMapping("req/get")
	@RequestMapping(value = "req/get", method = RequestMethod.GET)
	public String get() {
		return "GET";
	}

//	둘다 쓰는거 아니다. 둘중 하나만 쓰늗네 postmapping이 요즘방식
	@PostMapping("req/post")
	@RequestMapping(value = "req/post", method = RequestMethod.POST)
	public String post() {
		return "POST";
	}

	@PutMapping("req/put")
	@RequestMapping(value = "req/put", method = RequestMethod.PUT)
	public String put() {
		return "PUT";
	}

	@DeleteMapping("req/delete")
	@RequestMapping(value = "req/delete", method = RequestMethod.DELETE)
	public String delete() {
		return "DELETE";
	}
}