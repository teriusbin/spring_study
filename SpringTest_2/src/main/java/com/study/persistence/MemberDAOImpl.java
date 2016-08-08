package com.study.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.study.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{
	
	@Inject  //@Qualifier("exampleService")
	private SqlSession sqlSession;
	
	private static final String namespace = "com.study.MemberMapper";
	
	@Override
	public void inserMember(MemberVO vo) {
		// TODO Auto-generated method stub
		sqlSession.insert(namespace+".insertMember", vo);
	}
}
