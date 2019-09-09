package kr.co.service;

import java.util.List;

import kr.co.domain.BoardVO;
import kr.co.domain.MemberVO;
import kr.co.domain.pageTO;

public interface BoardService {
	public abstract Integer create(BoardVO vo) throws Exception;

	public abstract List<BoardVO> listall();

	public abstract BoardVO read(int bno);

	public abstract void del(int bno);

	

	public abstract BoardVO modifyUI(int bno);

	public abstract void modify(BoardVO vo);

	public abstract pageTO list(pageTO to);

	

	

	

	
	
}
