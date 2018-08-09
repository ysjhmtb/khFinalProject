package com.tikitaka.cloudFunding.member.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tikitaka.cloudFunding.member.model.dao.MemberDao;
import com.tikitaka.cloudFunding.member.model.vo.Member;
import com.tikitaka.cloudFunding.member.model.vo.Profile;

@Service
public class MemberService {

	@Autowired
	MemberDao dao;
	
	public int insertMember(Member member) {
		return dao.insertMember(member);
	}

	public Member selectMemeber(Member member) {
		
		return dao.selectMember(member);
	}

	public int updateMember(Member member) {
		
		return dao.updateMember(member);
	}

	public int insertProfile(Profile profile) {
		return dao.insertProfile(profile);
	}
}