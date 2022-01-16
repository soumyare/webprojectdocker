package com.example.webdockerspringboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class User {
	@ResponseBody
	@RequestMapping("user")
	public String init() {
		return "Hi users";
	}

}
