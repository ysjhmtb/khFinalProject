package com.kh.googleLogin.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	
	@RequestMapping("googlelogin.do")
	public String googleLogin() {
		return "member/googleLogin";
	}
	
}
