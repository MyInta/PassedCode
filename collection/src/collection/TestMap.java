package collection;

import java.util.HashMap;
import java.util.Map;

/**
 * ����Map�Ļ����÷�
 * @author ����
 *
 */
public class TestMap {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("����", new wife("������"));
		map.put("����", new wife("������"));
		
		map.remove("����");	//ͨ���ҵ���������������Ҳ���Ƴ��ˡ�
		wife w = (wife)map.get("����");
		System.out.println(w.name);
	}
}

class wife{
	String name;
	public wife(String name){
		this.name = name;
	}
}