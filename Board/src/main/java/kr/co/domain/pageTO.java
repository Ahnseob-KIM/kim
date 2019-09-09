package kr.co.domain;

import java.util.List;

public class pageTO {
	private int amount;
	private int curPage;
	private int perPage;
	private int totalPage;
	private int startNum;
	private int endNum;
	private List<BoardVO> list;
	
	private int perLine =10;
	private int bpn;
	private int spn;
	
	public pageTO() {
		curPage = 1;
		perPage = 10;
	}
	
	public pageTO(int curPage) {
		this.curPage = curPage;
		perPage = 10;
	}
	
	private void change() {
				totalPage = (amount-1)/perPage+1;
				startNum = (curPage -1)*perPage +1;
				endNum = curPage * perPage;
				if(endNum>amount)endNum = amount;

				bpn = ((curPage-1)/perPage)*perLine +1;
				spn = (((curPage-1)/perLine)+1) * perLine;
				if(spn>totalPage)spn=totalPage;
	}

	public pageTO(int curPage, int perPage, int amount, int startNum, int endNum, List<BoardVO> list, int perLine,
			int bpn, int spn) {
		super();
		this.curPage = curPage;
		this.perPage = perPage;
		this.amount = amount;
		this.startNum = startNum;
		this.endNum = endNum;
		this.list = list;
		this.perLine = perLine;
		this.bpn = bpn;
		this.spn = spn;
	}

	public int getCurPage() {
		return curPage;
	}

	public void setCurPage(int curPage) {
		this.curPage = curPage;
		change();
	}

	public int getPerPage() {
		return perPage;
	}

	public void setPerPage(int perPage) {
		this.perPage = perPage;
		change();
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
		change();
	}

	public int getStartNum() {
		return startNum;
	}

	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}

	public int getEndNum() {
		return endNum;
	}

	public void setEndNum(int endNum) {
		this.endNum = endNum;
	}

	public List<BoardVO> getList() {
		return list;
	}

	public void setList(List<BoardVO> list) {
		this.list = list;
	}

	public int getPerLine() {
		return perLine;
	}

	public void setPerLine(int perLine) {
		this.perLine = perLine;
		change();
	}

	public int getBpn() {
		return bpn;
	}

	public void setBpn(int bpn) {
		this.bpn = bpn;
	}

	public int getSpn() {
		return spn;
	}

	public void setSpn(int spn) {
		this.spn = spn;
	}
}
