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
//		html위치가 return 위치와 맞춰야한다.
	}

	@GetMapping("html/void")
	public void htmlVoid() {
	}
//	return을 안해주는 void이나 map같은 것은 @("")주소로 맞춰준다.

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

	@GetMapping("html/string") //주소연결 templates.html패키지 만들어서 object.html에 넣는다
	public Member htmlObject() {
		Member member = new Member();
		member.setName("kim");
		return member; //html에 member 객체 넘겨준다.
//		원래 롬복을 안쓰면 안넘어가진다. 왜냐면 get,setmethod가 없기 때문에
//		private변수에 접근 불가
	}	
	
	
//	코드 설명 mapping이 주소창에 주소가 연결
//	return이 html파일과 연결
//	그러나 object는 return이 객체이고 return 해주는 html파일이 없다.
//	그럼 mapping에 나와있는 주소로 html파일 연결
//	return 에 "html/object"와 같이 써야지 html파일과 연결
}