package com.daehyeon.basic.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.daehyeon.basic.model.Member;

@Controller
public class htmlController {
	@GetMapping("html/object")
	public String html() {
		return "html/string";
//		html��ġ�� return ��ġ�� ������Ѵ�.
	}

	@GetMapping("html/void")
	public void htmlVoid() {
	}
//	return�� �����ִ� void�̳� map���� ���� @("")�ּҷ� �����ش�.

	@GetMapping("html/map")
	public Map<String, Object> htmlMap(Map<String, Object> map) {
		Map<String, Object> map2 = new HashMap<String, Object>();
		return map2;
	}

	@GetMapping("html/model")
	public Model htmlModel(Model model) {
		return model;
	}

	@GetMapping("html/model_and_view")
	public ModelAndView htmlModel() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("html/model_and_view");
		return mav;
	}

	@GetMapping("html/string") //�ּҿ��� templates.html��Ű�� ���� object.html�� �ִ´�
	public Member htmlObject() {
		Member member = new Member();
		member.setName("kim");
		return member; //html�� member ��ü �Ѱ��ش�.
//		���� �Һ��� �Ⱦ��� �ȳѾ����. �ֳĸ� get,setmethod�� ���� ������
//		private������ ���� �Ұ�
	}	
	
	
//	�ڵ� ���� mapping�� �ּ�â�� �ּҰ� ����
//	return�� html���ϰ� ����
//	�׷��� object�� return�� ��ü�̰� return ���ִ� html������ ����.
//	�׷� mapping�� �����ִ� �ּҷ� html���� ����
//	return �� "html/object"�� ���� ����� html���ϰ� ����
}