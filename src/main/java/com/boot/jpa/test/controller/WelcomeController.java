package com.boot.jpa.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
/**
 * 
 * @author seva
 * 1. 서버에 있는 Controller가 요청을 받는다.
 * 2. Controller에 맵핑되는 url이 있다면 해당 메소드를 수행한다.
 * 3. return되는 문자열을 통해 HTML 파일을 찾아 응답한다.
 * 4. 메소드의 인자로 get요청의 파라미터 값을 받을 수 있다.
 * 5. Controller에서 메소드 인자로 Model을 받아 해당 Model에 값을 넣어 전달이 가능하다.
 * 
 */
@Controller
public class WelcomeController {
	@GetMapping("/helloworld")
	public String welcome(String name, int age, Model model) {
		System.out.println("name : " + name +" ||||||| age : " + age);
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		
		return "welcome";
	}
}
