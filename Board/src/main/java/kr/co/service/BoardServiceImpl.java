package kr.co.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.domain.BoardVO;
import kr.co.domain.MemberVO;
import kr.co.domain.pageTO;
import kr.co.persistance.BoardDAO;
import kr.co.persistance.MemberDAO;

@Service
@Transactional
public class BoardServiceImpl implements BoardService{
	
	@Inject
	private BoardDAO bDao;

	@Override
	public Integer create(BoardVO vo) throws Exception{
		// TODO Auto-generated method stub
		return bDao.create(vo);
	}

	@Override
	public List<BoardVO> listall() {
		// TODO Auto-generated method stub
		return bDao.listall();
	}

	@Override
	public BoardVO read(int bno) {
		// TODO Auto-generated method stub
		bDao.increaseviewcnt(bno);
		return bDao.read(bno);
	}

	@Override
	public void del(int bno) {
		// TODO Auto-generated method stub
		bDao.del(bno);
	}



	@Override
	public BoardVO modifyUI(int bno) {
		// TODO Auto-generated method stub
		return bDao.modifyUI(bno);
	}

	@Override
	public void modify(BoardVO vo) {
		bDao.modify(vo);
		
	}

	@Override
	public pageTO list(pageTO to) {
		// TODO Auto-generated method stub
		int amount = bDao.getAmount();
		to.setAmount(amount);
		
		List<BoardVO> list = bDao.list(to);
		to.setList(list);
		
		return to;
	}




}
