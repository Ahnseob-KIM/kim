package kr.co.ca;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.domain.BoardVO;
import kr.co.domain.pageTO;
import kr.co.service.BoardService;
import kr.co.service.MemberService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService bService;
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public void createUI() {
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String create(BoardVO vo) throws Exception {
		int reNum =  bService.create(vo);

		return "redirect:/board/listall";
	}
	
	@RequestMapping("/listall")
	public void listall(Model model) throws Exception{
		List<BoardVO>list =  bService.listall();
		model.addAttribute("list", list);
	}
	
	@RequestMapping("/read")
	public void read(int bno, Model model) throws Exception{
		BoardVO vo = bService.read(bno);
		model.addAttribute("vo", vo);
	}
	
	@RequestMapping(value = "/del", method = RequestMethod.POST)
	public String del(int bno) throws Exception {
		bService.del(bno);
		
		return "redirect:/board/listall";
	}
	
	@RequestMapping(value = "modify", method = RequestMethod.GET)
	public void modifyUI(int bno , Model model) {
		BoardVO vo=bService.modifyUI(bno);
		model.addAttribute("vo", vo);
	}
	
	@RequestMapping(value = "modify",method = RequestMethod.POST)
	public String modify(BoardVO vo) {
		bService.modify(vo);
		
		return "redirect:/board/read?bno="+vo.getBno();
	}
	
	@RequestMapping("/list")
	public void list(pageTO to, Model model) {
		pageTO dbTo = bService.list(to);
		model.addAttribute("to", dbTo);
		System.out.println(dbTo.getList());
	}
}
