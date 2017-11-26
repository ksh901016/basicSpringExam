package org.zerock.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.MemberVO;

// DAO를 스프링에 인식시키기 위해서 주로사용
@Repository
public class MemberDAOImpl implements MemberDAO {

	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "org.zerock.mapper.MemberMapper";
	
	@Override
	public String getTime() {
		return sqlSession.selectOne(namespace+".getTime");
	}

	@Override
	public void inertMember(MemberVO vo) {
		sqlSession.insert(namespace+".insertMember", vo);
	}

	@Override
	public MemberVO readMember(String userid) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberVO readWithPW(String userid, String userpw) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
