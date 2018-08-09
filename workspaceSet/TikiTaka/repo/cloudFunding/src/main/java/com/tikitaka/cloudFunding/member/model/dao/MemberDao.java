package com.tikitaka.cloudFunding.member.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tikitaka.cloudFunding.member.model.vo.Member;
import com.tikitaka.cloudFunding.member.model.vo.Profile;

@Repository
public class MemberDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public int insertMember(Member member) {
		
		return sqlSession.insert("MemberMapper.insertMember",member);
	}

	public Member selectMember(Member member) {
		System.out.println("dao.selectMember");
		return sqlSession.selectOne("MemberMapper.selectMemberEmail", member);
	}

	public int updateMember(Member member) {
		
		System.out.println(member);
		
		return 0;
	}

	public int insertProfile(Profile profile) {
		
		System.out.println(profile);
		
		return 0;
	}
	
}