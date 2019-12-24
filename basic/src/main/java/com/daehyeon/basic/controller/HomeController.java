package com.daehyeon.basic.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//shift + ctrl + f : 코드 정렬
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

// shift+alt+a : 열편집

//slf4j import
@Slf4j   // logger ->log

@Controller
public class HomeController {

	Logger logger=LoggerFactory.getLogger(this.getClass());
	@RequestMapping("/")
	public String home() {
		log.trace("trace!");
		log.debug("debug!"); // 개발단계에서 확인용
		log.info("info!"); // 운용 상 필요한 정보
		log.warn("warn!"); // 메모리 문제 등 경고
		log.error("error!"); // 치명적인 오류
		log.error("error!"); // 치명적인 오류
// 현재 파일은 문제없지만 이렇게 뜬다를 확인하기 위해 글로 출력한 것		
		         
		return "home";
	}
}
