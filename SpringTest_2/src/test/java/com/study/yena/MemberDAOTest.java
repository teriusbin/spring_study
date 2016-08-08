package com.study.yena;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.study.domain.MemberVO;
import com.study.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class MemberDAOTest {
	
	@Inject
	private MemberDAO dao;
	
	@Test
	public void testInserMember()throws Exception{
		MemberVO vo = new MemberVO();
		vo.setUserID("test");
		vo.setUserPW("1234");
		vo.setUserName("yena");
		
		dao.inserMember(vo);
	}
}