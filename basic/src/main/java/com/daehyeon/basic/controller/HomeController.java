package com.daehyeon.basic.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//shift + ctrl + f : �ڵ� ����
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

// shift+alt+a : ������

//slf4j import
@Slf4j   // logger ->log

@Controller
public class HomeController {

	Logger logger=LoggerFactory.getLogger(this.getClass());
	@RequestMapping("/")
	public String home() {
		log.trace("trace!");
		log.debug("debug!"); // ���ߴܰ迡�� Ȯ�ο�
		log.info("info!"); // ��� �� �ʿ��� ����
		log.warn("warn!"); // �޸� ���� �� ���
		log.error("error!"); // ġ������ ����
		log.error("error!"); // ġ������ ����
// ���� ������ ���������� �̷��� ��ٸ� Ȯ���ϱ� ���� �۷� ����� ��		
		         
		return "home";
	}
}
