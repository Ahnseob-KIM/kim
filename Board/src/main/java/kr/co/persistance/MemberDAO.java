package kr.co.persistance;

import java.util.List;

import kr.co.domain.MemberVO;

public interface MemberDAO {
	
	public abstract void insert(MemberVO vo);

	public abstract MemberVO idcheck(String id);

	public abstract List<MemberVO> list();

	public abstract MemberVO read(String id);
	
	public abstract void update(MemberVO vo);

	public abstract void del(String id);

	
	
	

}
