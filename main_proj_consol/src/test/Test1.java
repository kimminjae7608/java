package test;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import dao.V_ConditionDao;
import vo.V_ConditionVo;

public class Test1 {
	public static void main(String[] args) {
		
		List<V_ConditionVo> list = null;
		V_ConditionDao dao = V_ConditionDao.getInstance();
		//전체조회
		list = dao.getList();
		for(V_ConditionVo v : list)
			System.out.println(v);
		//id로 condition조회
		System.out.println();
		String u_id = "minjae1";
		V_ConditionVo vo = dao.getV_Condition(u_id);
		System.out.println(vo);
		
		
		  //사용안하는 자료 String -> date 타입으로 변환 (미완성) 
//		  SimpleDateFormat sdf = new
//		  SimpleDateFormat("yyyy-mm-dd");

		//String -> Date(sql) 타입 변환
		String input = "1995-07-18";
		Date d = Date.valueOf(input);
		  
		dao.update("minjae", d);
		 
		
//		dao.update("minjae", d);
		System.out.println();
		list = dao.getList();
		for(V_ConditionVo v : list)
			System.out.println(v);
		dao.certificate("minjae");
	}
}
