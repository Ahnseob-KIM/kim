package kr.co.persistance;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.domain.MemberVO;

@Repository /* 나중에 빈으로 사용할 것이라고 지정해 주는것! */
public class MemberDAOImpl implements MemberDAO{
	
	
	@Inject
	private SqlSession session;
	
	private final String NS = "kr.co.mapper.member";

	@Override
	public void insert(MemberVO vo) {
		session.insert(NS+".insert", vo);
	}

	@Override
	public MemberVO idcheck(String id) {
		// TODO Auto-generated method stub
		return session.selectOne(NS+".idcheck", id);
	}

	@Override
	public List<MemberVO> list() {
		// TODO Auto-generated method stub
		return session.selectList(NS+".list");
	}

	@Override
	public MemberVO read(String id) {
		// TODO Auto-generated method stub
		return session.selectOne(NS+".read",id);
	}
	
	@Override
	public void update(MemberVO vo) {
		
		session.update(NS+".update", vo);
		
	}

	@Override
	public void del(String id) {
		session.delete(NS+".del", id);
		
	}



}
