package com.boot.jpa.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.boot.jpa.test.domain.User;

/**
 * 
 * @author seva
 * 1. Post 요청은 PostMapping 어노테이션으로 받는다.
 * 2. VO를 만들어 처리하는 메소드의 인자로 주면. Post 요청으로 넘어오는 값을 간편하게 받을 수 있다.
 * 3. VO의 Setter 메소드와 요청에 넘어오는 값의 이름과 맵핑되어 자동으로 값을 받을 수 있도록 Spring이 도와준다.
 *
 */

@Controller
public class UserController {
	private List<User> users = new ArrayList<User>();

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/join")
	public String join() {
		return "form";
	}
	
	@PostMapping("/create")
	public String create(User user) {
		System.out.println("user : " + user);
		users.add(user);
		
		return "redirect:/list";
	}
	
	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("users", users);
		return "list";
	}
}
