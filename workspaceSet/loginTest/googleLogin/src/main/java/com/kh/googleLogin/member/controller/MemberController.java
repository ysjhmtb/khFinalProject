package com.kh.googleLogin.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	
	@RequestMapping("googlelogin.do")
	public String googleLogin() {
		return "member/googleLogin";
	}
	
	@RequestMapping("loginPage.do")
	public String loginPage() {
		return "member/loginPage";
	}
	
	@RequestMapping("joinPage.do")
	public String joinPage() {
		return "member/joinPage";
				
	}
	
	@RequestMapping("signBtn.do")
	public String signBtn() {
		return "member/signBtn";
	}
	
	
}
