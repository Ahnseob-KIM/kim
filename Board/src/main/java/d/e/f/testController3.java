package d.e.f;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import kr.co.domain.MemberVO;

@Controller
public class testController3 {
	
	@RequestMapping(value = "/test44",method = RequestMethod.GET)
	public void test44(Model model) {
		List<MemberVO> list = new ArrayList<MemberVO>();
		list.add(new MemberVO("m1", "a", 11));
		list.add(new MemberVO("m2", "b", 12));
		list.add(new MemberVO("m3", "c", 13));
		list.add(new MemberVO("m4", "d", 14));
		list.add(new MemberVO("m5", "e", 15));
		
		model.addAttribute("list", list);
		
	}
	@RequestMapping(value = "/test44",method = RequestMethod.POST)
	@ResponseBody
	public List<Map<String, Object>> test44(@RequestParam Map<String, Object> map) throws Exception{
		
		String jsonStr = map.get("list").toString();
		
		ObjectMapper mapper = new ObjectMapper();
		List<Map<String, Object>> list = mapper.readValue(jsonStr, new TypeReference<ArrayList<Map<String, Object>>>() {});
		
		for(Map<String, Object> x : list) {
			System.out.println("@@@@@@@@@@@@@@");
			System.out.println(x.get("id"));
			System.out.println(x.get("name"));
			System.out.println(x.get("age"));
			System.out.println("@@@@@@@@@@@@@@");
		}
		return list;
	}
	
	@RequestMapping(value = "/test33",method = RequestMethod.GET)
	public void test33() {
		
	}
	
	@RequestMapping(value = "/test33",method = RequestMethod.POST)
	@ResponseBody
	public MemberVO test33(MemberVO vo) {
		System.out.println(vo);
		
		return vo;
	}
	
	@RequestMapping(value = "/test22",method = RequestMethod.GET)
	public void test22() {
		
	}
	
	@RequestMapping(value = "/test22",method = RequestMethod.POST)
	@ResponseBody
	public String[] test22(String[] arr) {
		for(String x : arr) {
			System.out.println(x);
		}
		return arr;
	}
	
	@RequestMapping(value = "/test11", method = RequestMethod.GET)
	public void test11() {
		
	}
	
	@RequestMapping(value = "/test11",method = RequestMethod.POST)
	@ResponseBody
	public String test11(String str) {
		System.out.println(str);
		
		return str;
	}
	
}
