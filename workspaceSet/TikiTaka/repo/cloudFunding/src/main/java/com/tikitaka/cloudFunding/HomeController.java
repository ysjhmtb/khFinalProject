package com.tikitaka.cloudFunding;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
//
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "index.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );


		System.out.println("sd");
		System.out.println("123");
		System.out.println("333");
		System.out.println("444");
		System.out.println("정인 수정2");
		System.out.println("지상");
		System.out.println("가용");

		return "home";
	}
	
}


/*
 * 
 resources/문서
 
 File -> Import -> Clone URI -> Next -> URI : Git 사이트에 있는 URI 붙혀넣기->User Password에 자신의 깃아이디
입력 -> 후 next -> Import existing Eclipse projects -> next -> 체크란 체크 -> Finsh

브런치 생성

프로젝트 우클릭 -> Team ->SwitchTo->New Branch -> sini(예 이름등 입력하고 싶은거 입력)


-------------------------소스 수정법 ------------------------------------------------
소스 수정후 커밋

소스 수정은 자신의 브런치 cloudFunding[TikiTaka sini] 에서 수정 -> 프로젝트 우클릭 -> Team -> Commit
->Commit Message에 수정사항 입력후 Commit and Push... 클릭-> OK 


마스터 브랜치 합치기
프로젝트 우클릭 -> Team -> SwitchTo->Master Branch 클릭 -> 프로젝트 우클릭 Team -> 
Pull 클릭 -> 프로젝트 우클릭 -> Team -> Merge 클릭 ->
Local 폴더 밑 자신이 생성한 브런치(sini) 클릭후 
Merge버튼 클릭 만약 프로젝트 브런치 이름 옆에 화살표가 있을시 ->Team-> Push to Upstream

자신의 브랜치에 마스터 합치기
프로젝트 우클릭 -> Team -> SwitchTo->sini(자기꺼) Branch 클릭 -> 프로젝트 우클릭 Team -> 
 Merge 클릭 -> Local 폴더 밑 자신이 생성한 브런치(master) 클릭후 
Merge버튼 클릭 만약 프로젝트 브런치 이름 옆에 화살표가 있을시 ->Team-> Push to Upstream


 
 */
