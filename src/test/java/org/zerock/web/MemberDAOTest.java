package org.zerock.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.MemberVO;
import org.zerock.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MemberDAOTest {

	@Inject
	private MemberDAO dao;
	
	public void testTime() {
		System.out.println(dao.getTime());
	}
	
	public void testInsertMember() {
		MemberVO vo = new MemberVO();
		vo.setUserid("user01");
		vo.setUserpw("user01");
		vo.setUsername("USER01");
		vo.setEmail("user01@aaa.com");
		
		dao.inertMember(vo);
	}
	
	@Test
	public void testReadMember() throws Exception {
		String id1 = "user00";
		String id2 = "user01";
		
		MemberVO result01 = dao.readMember(id1);
		MemberVO result02 = dao.readMember(id2);
		
		System.out.println(result01);
		System.out.println(result02);
	}

}
