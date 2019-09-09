package kr.co.persistance;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.domain.BoardVO;
import kr.co.domain.pageTO;


@Repository /* 나중에 빈으로 사용할 것이라고 지정해 주는것! */
public class BoardDAOImpl implements BoardDAO{
	
	@Inject
	private SqlSession session;
	
	private final String NS = "kr.co.mapper.board";

	@Override
	public Integer create(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		return session.insert(NS+".create", vo);
	}

	@Override
	public List<BoardVO> listall() {
		// TODO Auto-generated method stub
		return session.selectList(NS+".listall");
	}

	@Override
	public BoardVO read(int bno) {
		// TODO Auto-generated method stub
		return session.selectOne(NS+".read", bno);
	}

	@Override
	public void increaseviewcnt(int bno) {
		// TODO Auto-generated method stub
		session.update(NS+".increaseviewcnt", bno);
	}

	@Override
	public void del(int bno) {
		// TODO Auto-generated method stub
		session.delete(NS+".del", bno);
		
	}

	@Override
	public BoardVO modifyUI(int bno) {
		// TODO Auto-generated method stub
		return session.selectOne(NS+".modifyUI", bno);
	}

	@Override
	public void modify(BoardVO vo) {
		// TODO Auto-generated method stub
		session.update(NS+".modify", vo);
		
	}

	@Override
	public int getAmount() {
		// TODO Auto-generated method stub
		return session.selectOne(NS+".getAmount");
	}

	@Override
	public List<BoardVO> list(pageTO to) {
		// TODO Auto-generated method stub
		return session.selectList(NS+".list", to);
	}






}
