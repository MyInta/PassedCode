package collection;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试Map的基本用法
 * @author 银涛
 *
 */
public class TestMap {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("张三", new wife("李米米"));
		map.put("李四", new wife("张曼玉"));
		
		map.remove("张三");	//通过找到张三，把李米米也给移除了。
		wife w = (wife)map.get("李四");
		System.out.println(w.name);
	}
}

class wife{
	String name;
	public wife(String name){
		this.name = name;
	}
}