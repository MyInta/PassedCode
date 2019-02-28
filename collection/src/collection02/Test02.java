package collection02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 使用容器来做表格，效果和Test01要一致
 * @author 银涛
 *
 */
public class Test02 {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("id", 2304);
		map.put("name", "Inta");
		map.put("department", "项目部");
		map.put("salary", 3000);
		map.put("hireDate", "2019-09");

		Map map01 = new HashMap();
		map01.put("id", 2305);
		map01.put("name", "Lily");
		map01.put("department", "教学部");
		map01.put("salary", 3500);
		map01.put("hireDate", "2018-09");
		
		Map map02 = new HashMap();
		map02.put("id", 2306);
		map02.put("name", "Katte");
		map02.put("department", "管理部");
		map02.put("salary", 4000);
		map02.put("hireDate", "2017-09");
		
		List <Map> list = new ArrayList<Map> ();
		list.add(map);
		list.add(map01);
		list.add(map02);
		
		printEmployeeName(list);

	}
	public static void printEmployeeName(List<Map> list){
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).get("name")+"--"+list.get(i).get("salary"));
		}
	}
	
}
