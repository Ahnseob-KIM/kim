package kr.co.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.domain.MemberVO;
import kr.co.persistance.MemberDAO;

@Service
@Transactional
public class MemberServiceImpl implements MemberService{
	
	@Inject
	private MemberDAO mdao;

	@Override
	public void insert(MemberVO vo) {
		 mdao.insert(vo);
	}
	
	@Override
	public MemberVO idcheck(String id) {
		
		return mdao.idcheck(id);
	}
	
	public List<MemberVO> list(){
		return mdao.list();
	}

	@Override
	public MemberVO read(String id) {
		// TODO Auto-generated method stub
		return mdao.read(id);
	}
	
	@Override
	public void update(MemberVO vo) {
		
		mdao.update(vo);
	}

	@Override
	public MemberVO updateUI(String id) {
		// TODO Auto-generated method stub
		return mdao.read(id);
	}

	@Override
	public void del(String id) {
		mdao.del(id);

	}


}
